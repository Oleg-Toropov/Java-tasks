package Task_130;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SingleNod {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer i : data) {
            int j = i;
            StringBuilder st = new StringBuilder();
            while (j > 0) {
                st.append("1");
                j--;
            }
            numbers.add(Integer.valueOf(String.valueOf(st)));
        }

        int a = numbers.get(0);
        int b = numbers.get(1);
        while (a != b) {  // Используется алгоритм Евклида
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(a));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

