package Task_102;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] actions = data.toCharArray();
        int amountFlours = 1;

        for (int i = 0; i < actions.length; i++) {
            if (i != 0 && actions[i] == actions[i - 1]) {
                amountFlours++;
            } else if (i == 0) {
                amountFlours++;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(amountFlours));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
