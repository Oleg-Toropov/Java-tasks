package Task_127;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Wagons {
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
        int count = 0;
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i + 1) - data.get(i) != 1) {
                count++;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(count));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
