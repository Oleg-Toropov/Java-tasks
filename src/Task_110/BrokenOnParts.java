package Task_110;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BrokenOnParts {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int count = data.get(0) / data.get(1);
        int remainder = data.get(0) % data.get(1);

        for (int i = 0; i < data.get(1); i++) {
            if (i != data.get(1) -1) {
                result.append(count + " ");
            } else {
                if (remainder >0) {
                    result.append(count + 1);
                } else {
                    result.append(count);
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
