package Task_7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        try (FileReader reader = new FileReader("task-7-input.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String result = String.valueOf(listInput.get(0) * listInput.get(1) * listInput.get(2) * 2);

        try (FileWriter writer = new FileWriter("task-7-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
