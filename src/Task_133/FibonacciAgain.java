package Task_133;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FibonacciAgain {
    public static void main(String[] args) {
        long data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = (sc.nextLong()) % 60;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        long a = 1;
        long b = 1;
        while (data > 1) {
            b = a + b;
            a = b - a;
            data--;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(b % 10));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
