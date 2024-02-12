package Task_128;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Honey {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int collectedHoney = 0;
        int potVolume = data.get(1);
        int ate = data.get(2);
        String result = "YES";

        for (int i = 0; i < data.get(0); i++) {
            if (potVolume - ate * i > 0) {
                collectedHoney = collectedHoney + (potVolume - ate * i);
            } else {
                result = "NO";
                break;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result + " " + collectedHoney);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
