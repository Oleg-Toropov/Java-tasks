package Task_124;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        int data;

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int numberOfHeads = 0;

            while (data > 0) {
                numberOfHeads++;
                data -= numberOfHeads;
            }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(numberOfHeads));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
