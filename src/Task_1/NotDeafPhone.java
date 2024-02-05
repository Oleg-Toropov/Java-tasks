package Task_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotDeafPhone {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new FileReader("task-1-input.txt"));
             FileWriter write = new FileWriter("task-1-output.txt")) {
            String readInput = sc.next();
            write.write(readInput);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}