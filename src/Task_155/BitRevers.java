package Task_155;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BitRevers {
    public static void main(String[] args) {
        long data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        StringBuilder reversDate = new StringBuilder();
        if (data == 0) {
            reversDate.append(0);
        } else {
            while (data > 0) {
                reversDate.append(data % 2);
                data /= 2;
            }
        }

        long result = Long.parseLong(String.valueOf(reversDate), 2);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
