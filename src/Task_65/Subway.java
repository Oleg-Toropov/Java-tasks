package Task_65;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Subway {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> listInput = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader("input.txt"));
        while (scanner.hasNextInt()) {
            listInput.add(scanner.nextInt());
        }
        int a = Math.abs(listInput.get(2) - listInput.get(1))  - 1;
        int b = (listInput.get(2) > listInput.get(1)) ? listInput.get(0) - listInput.get(2) + listInput.get(1) - 1
                : listInput.get(0) - listInput.get(1) + listInput.get(2) - 1;
        int result = (a < b) ? a : b;

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
