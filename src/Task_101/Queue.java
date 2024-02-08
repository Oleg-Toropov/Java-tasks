package Task_101;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        int data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int hour = 0, minute = 0, count = 1;

        while (count < data) {
            if (hour == 20 - 8 && minute == 0) {
                break;
            } else {
                minute = minute + 5;
                if (minute == 60) {
                    hour++;
                    minute = 0;
                }
                count++;
            }
        }

        String result = (hour == 20 - 8 && minute == 0 && count != data) ? "NO" : hour + " " + minute;

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
