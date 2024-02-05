package Task_56;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Census {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int oldest = 0;
        int number = 0;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(list);

        for (int i = 1; i < list.size(); i = i + 2) {
            if (oldest < list.get(i) && list.get(i + 1) == 1) {
                oldest = list.get(i);
            }
        }

        if (oldest != 0) {
            for (int i = 1; i < list.size(); i = i + 2) {
                number++;
                if (list.get(i) == oldest && list.get(i + 1) == 1) {
                    break;
                }
            }
        } else {
            number = -1;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(number));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
