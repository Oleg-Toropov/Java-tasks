package Task_40;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Flowers {

    public static void main(String[] args) {
        ArrayDeque<String> order = new ArrayDeque<>(Arrays.asList("G", "C", "V"));
        StringBuilder result = new StringBuilder();
        int a;

        try (FileReader reader = new FileReader("task-40-input.txt")) {
            Scanner scanner = new Scanner(reader);
            a = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (a > 0) {
            order.addFirst(order.getLast());
            order.removeLast();
            a--;
        }

        for (String s : order) {
            result.append(s);
        }

        try (FileWriter writer = new FileWriter("task-40-output.txt")) {
            writer.write(result.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
