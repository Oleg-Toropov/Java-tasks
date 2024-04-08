package Task_149;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class NumbersWithoutIdenticalDigits {
    public static void main(String[] args) {
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
            char[] ch = String.valueOf(number).toCharArray();
            Set<Character> set = new HashSet<>();
            for (char c : ch) {
                set.add(c);
            }
            if (set.size() == ch.length) {
                index++;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(number));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
