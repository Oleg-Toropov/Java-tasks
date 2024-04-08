package Task_153;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Circles {
    public static void main(String[] args) {
        int data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int countParts = (data == 0)? 1 : data * (data - 1) + 2;

        try (FileWriter writer = new FileWriter ("output.txt")){
            writer.write(String.valueOf(countParts));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
