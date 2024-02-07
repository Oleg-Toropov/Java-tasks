package Task_98;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        int cut;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            cut = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int oneCut = 2;
        int lastCut = oneCut;
        int nowCut = 4;

        if (cut == 1) {
            nowCut = oneCut;
        } else {
            for (int i = 2; i <= cut; i++) {
                lastCut = lastCut + i;
                nowCut = lastCut;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(nowCut));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
