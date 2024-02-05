package Task_79;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Roads {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        int countRoads = 0;
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Integer i : listInput) {
            if (i == 1) {
                countRoads++;
            }
        }
        countRoads = countRoads / 2;

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(countRoads));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
