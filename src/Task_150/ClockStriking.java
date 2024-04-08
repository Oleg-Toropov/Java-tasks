package Task_150;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClockStriking {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Map<Integer, Integer> dial = new HashMap<>();
        for (int i = 0; i < 24; i++) {
            if (i == 0) {
                dial.put(i, 12);
            } else if (i > 12) {
                dial.put(i, i - 12);
            } else {
                dial.put(i, i);
            }
        }

        int counthours = 0;
        int sumBitsHours = 0;
        if (data.get(0) > data.get(2)) {
            for (int i = data.get(0) + 1; i < 24; i++) {
                sumBitsHours += dial.get(i);
                counthours++;
            }
            for (int i = 0; i <= data.get(2); i++) {
                sumBitsHours += dial.get(i);
                counthours++;
            }
        } else {
            for (int i = data.get(0) + 1; i <= data.get(2); i++) {
                sumBitsHours += dial.get(i);
                counthours++;
            }
        }

        int sumBitsHalf = (data.get(1) > 30 && data.get(3) < 30 || data.get(1) < 30 && data.get(3) > 30) ?
                counthours - 1 : counthours;

        String result = String.valueOf(sumBitsHours + sumBitsHalf);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
