package Task_120;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tourist {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Tent> tents = new ArrayList<>();
        int numberOfPeople;
        int maxWeight;

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        numberOfPeople = data.get(1);
        maxWeight = data.get(0);
        data.remove(0);
        data.remove(0);

        for (int i = 0; i < data.size() - 1; i = i + 2) {
            tents.add(new Tent(data.get(i + 1), data.get(i)));
        }

        tents.sort((x, y) -> x.weight - y.weight);

        for (Tent t : tents) {
            if (maxWeight - t.weight > 0) {
                maxWeight = maxWeight - t.weight;
                numberOfPeople = numberOfPeople - t.capacity;
            }
        }

        String result = (numberOfPeople <= 0) ? "YES" : "NO";

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Tent {
    int capacity;
    int weight;

    public Tent(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }
}
