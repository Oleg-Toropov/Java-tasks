package Task_60;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Herons {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int min;
        int max;
        Scanner scanner = new Scanner(new FileReader("input.txt"));
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);
        min = list.get(0) / 2 + list.get(0) % 2;
        max = list.get(0);

        String result = String.valueOf(min) + " " + String.valueOf(max);
        FileWriter writer = new FileWriter("output.txt");
        writer.write(result);
        writer.close();
    }
}
