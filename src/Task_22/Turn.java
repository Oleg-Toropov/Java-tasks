package Task_22;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Turn {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        FileReader reader = new FileReader("task-22-input.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        for (int i = list.size() - 1; i > 0; i--) {
            output.append(list.get(i)).append(" ");
        }

        FileWriter writer = new FileWriter("task-22-output.txt");
        writer.write(output.toString());
        writer.close();
    }
}
