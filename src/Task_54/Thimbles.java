package Task_54;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Thimbles {
    public static void main(String[] args) {
        String input;
        int position = 1;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] ch = input.toCharArray();

        int i = 0;
        while (i < ch.length) {
            if (ch[i] == 'A' && position == 1) {
                position = 2;
            } else if (ch[i] == 'A' && position == 2) {
                position = 1;
            } else if (ch[i] == 'B' && position == 2) {
                position = 3;
            } else if (ch[i] == 'B' && position == 3) {
                position = 2;
            } else if (ch[i] == 'C' && position == 1) {
                position = 3;
            } else if (ch[i] == 'C' && position == 3) {
                position = 1;
            }
            i++;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(position));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
