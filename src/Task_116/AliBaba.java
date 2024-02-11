package Task_116;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AliBaba {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int maxCount = data.get(1);
        data.remove(0);
        data.remove(0);
        data.sort((x, y) -> -x.compareTo(y));
        int maxCost = 0;

        for (int i = 0; i < maxCount; i++) {
            maxCost += data.get(i);
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(maxCost));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
