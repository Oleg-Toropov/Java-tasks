package Task_49;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        ArrayList<Integer> listIn = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))){
            while (scanner.hasNextLine()) {
                listIn.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int step = listIn.get(1) - listIn.get(0);
        int result = (listIn.get(2) - 2) * step + listIn.get(1);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
