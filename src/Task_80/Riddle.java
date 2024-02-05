package Task_80;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        int x, y;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        x = (int) ((listInput.get(0) - (Math.sqrt(Math.pow(listInput.get(0), 2) - 4 * listInput.get(1)))) / 2);
        y = (int) ((listInput.get(0) + (Math.sqrt(Math.pow(listInput.get(0), 2) - 4 * listInput.get(1)))) / 2);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(x) + " " + String.valueOf(y));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
