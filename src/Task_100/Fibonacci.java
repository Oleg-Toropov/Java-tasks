package Task_100;

import java.io.*;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int a = 1, b = 1, count = 2;

        while (b < data) {
            b = a + b;
            a = b - a;
            count++;
        }

        String result = (data == b)? "1\n" + String.valueOf(count) : "0";

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
