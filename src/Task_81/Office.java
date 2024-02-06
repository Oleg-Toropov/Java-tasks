package Task_81;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Office {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        int countEmployees = 0;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Integer i: listInput) {
            countEmployees += i;
        }

        String result = String.valueOf(countEmployees / 27);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
