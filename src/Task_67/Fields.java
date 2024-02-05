package Task_67;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fields {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int a;
        double b;
        String result;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        a = list.get(0) * list.get(1);
        b = Math.sqrt(a);

        result = (a % b == 0) ? String.valueOf(Math.round(b)) : "0";

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
