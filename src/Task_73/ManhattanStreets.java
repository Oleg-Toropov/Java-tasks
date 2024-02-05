package Task_73;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManhattanStreets {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        int area;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        area = listInput.get(0) * listInput.get(2) * listInput.get(3)
                + listInput.get(1) * listInput.get(2) * listInput.get(3)
                - (int) Math.pow(listInput.get(2), 2) * listInput.get(0) * listInput.get(1);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(area));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
