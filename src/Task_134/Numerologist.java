package Task_134;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Numerologist {
    public static void main(String[] args) {
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))){
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        long count = 0;

        while (data.length() > 1) {
            long sum = 0;
            char [] ch = data.toCharArray();
            for (char c: ch) {
                sum +=Character.getNumericValue(c);
            }
            data = String.valueOf(sum);
            count++;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(data + " " + count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
