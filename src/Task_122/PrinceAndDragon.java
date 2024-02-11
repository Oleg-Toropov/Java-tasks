package Task_122;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrinceAndDragon {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int dragonHeads = data.get(1);
        int swordStrikes = 0;

        if (data.get(0) >= dragonHeads) {
            swordStrikes++;
        } else if (data.get(0) < dragonHeads && data.get(0) > data.get(2)) {
            while (dragonHeads > 0) {
                dragonHeads = dragonHeads - data.get(0);
                if (dragonHeads != 0) {
                    dragonHeads += data.get(2);
                }
                swordStrikes++;
            }
        }

        String result = (swordStrikes > 0) ? String.valueOf(swordStrikes) : "NO";

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
