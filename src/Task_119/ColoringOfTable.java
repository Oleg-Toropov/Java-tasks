package Task_119;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ColoringOfTable {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
//        ArrayList<Integer> resultMultiplying = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int countBlue = 0;
        int countGreen = 0;
        int countRed = 0;
        int countBlack = 0;

        for (int i = 1; i <= data.get(0); i++) {
            for (int j = 1; j <= data.get(1); j++) {
                if (i * j % 5 == 0) {
                    countBlue++;
                } else if (i * j % 3 == 0) {
                    countGreen++;
                } else if (i * j % 2 == 0) {
                    countRed++;
                } else {
                    countBlack++;
                }
            }
        }

        String result = "RED : " + countRed + "\nGREEN : " + countGreen +
                "\nBLUE : " + countBlue + "\nBLACK : " + countBlack;

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
