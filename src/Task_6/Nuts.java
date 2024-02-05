package Task_6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nuts {
    public static void main(String[] args) {
        List<Integer> listInput = new ArrayList<>();
        try (FileReader reader = new FileReader("task-6-input.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String result = (listInput.get(0) * listInput.get(1) >= listInput.get(2)) ? "YES" : "NO";

        try (FileWriter writer = new FileWriter("task-6-output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


