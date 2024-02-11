package Task_121;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Carousel {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        data.remove(0);

        int totalPoints = 0;
        int point = 3;

        for (int i : data) {
            if (i == 1) {
                totalPoints += point;
                point ++;
            } else {
                if (point <= 6) {
                    point = 3;
                } else {
                    point -= 3;
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(totalPoints));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
