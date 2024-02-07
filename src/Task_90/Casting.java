package Task_90;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        int min;
        int max;
        String result;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                listInput.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int type = listInput.get(0);
        int n = listInput.get(1);
        listInput.remove(0);
        listInput.remove(0);
        Collections.sort(listInput);
        int a = listInput.get(0);
        int b = listInput.get(1);
        int c = listInput.get(2);

        if (type == 2) {
            max = a;
            result = String.valueOf(max);
        } else {
            if (a == 0 || b == 0 || c == 0 || a + b <= n) {
                min = 0;
            } else {
                min = a + b - n;
            }
            result = String.valueOf(min);
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
