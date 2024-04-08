package Task_149;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumbersWithoutIdenticalDigits2 {
    public static void main(String[] args) throws IOException {
        int data;

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int number = 0;
        int index = 1;

        while (index <= data) {
            number++;
            int numberCopy = number;
            boolean isSet = true;
            Set<Integer> set = new HashSet<>();
            while (numberCopy != 0) {
                if (set.contains(numberCopy % 10)) {
                    isSet = false;
                } else {
                    set.add(numberCopy % 10);
                }
                numberCopy /= 10;
            }
            index += (isSet) ? 1 : 0;
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(number));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
