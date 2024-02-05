package Task_52;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PlayingDice {
    public static void main(String[] args) {
        int in;
        int min;
        int max;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            in = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        max = in * 6;
        int ost = 0;
        if (in % 6 < 6 && in % 6 != 0) {
            ost = (in % 6 == 1) ? 6 :
                    (in % 6 == 2) ? 5 :
                            (in % 6 == 3) ? 4 :
                                    (in % 6 == 4) ? 3 : 2;
        }
        min = in / 6 + ost;

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(min) + " " + String.valueOf(max));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
