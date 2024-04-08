package Task_156;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulWall {
    public static void main(String[] args) {
        int data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int h, w;
        if (data == 1) {
            h = 0;
            w = 1;
        } else {
            h = (int) Math.sqrt(data);
            w = h;
            int b1 = (h - w) + (data - h * w);
            int wCopy = w;
            while (h * (wCopy + 1) <= data) {
                wCopy++;
                int b2 = (wCopy - h) + (data - h * wCopy);
                if (b1 >= b2) {
                    w = wCopy;
                }
            }
        }

        String result = h + " " + w;

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
