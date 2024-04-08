package Task_152;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AmazingNumbers {
    public static void main(String[] args) {
        int data;

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int count = 0;

        for (int number1 = 1; number1 < data; number1++) {
            int number2 = data - number1;
            int last_symbol_number1 = number1 % 10;
            int first_symbol_number2 = Integer.valueOf(String.valueOf(number2).substring(0, 1));

            if (last_symbol_number1 == first_symbol_number2) {
                int revers_number2 = 0;
                while (number2 != 0) {
                    revers_number2 = revers_number2 * 10 + number2 % 10;
                    number2 /= 10;
                }
                if (number1 == revers_number2) {
                    count++;
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(count));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


