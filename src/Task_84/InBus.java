package Task_84;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InBus {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        String result;
        int min;
        int max;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        min = (listInput.get(0) >= listInput.get(1)) ? listInput.get(0) : listInput.get(1);
        max = (listInput.get(1) > 0) ? listInput.get(0) + (listInput.get(1) - 1) : listInput.get(0);
        result = (listInput.get(0) == 0 && listInput.get(1) == 0) ? "0 0"
                : (listInput.get(0) != 0) ? min + " " + max
                : "Impossible";

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
