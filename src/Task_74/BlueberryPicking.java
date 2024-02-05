package Task_74;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BlueberryPicking {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        listInput.remove(0);

        int maxBerries = 0;
        int countBerries = 0;

        for (int i = 0; i < listInput.size(); i++) {
            if (i == 0) {
                countBerries = listInput.get(i) + listInput.get(listInput.size() - 1) + listInput.get(i + 1);
            } else if (i == listInput.size() - 1) {
                countBerries = listInput.get(i) + listInput.get(i - 1) + listInput.get(0);
            } else {
                countBerries = listInput.get(i) + listInput.get(i - 1) + listInput.get(i + 1);
            }

            if (maxBerries < countBerries) {
                maxBerries = countBerries;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(maxBerries));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
