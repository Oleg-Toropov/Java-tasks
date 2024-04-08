package Task_148;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TableMultiply {

    public static void main(String[] args) {
        int[] data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = new int[]{sc.nextInt(), sc.nextInt()};
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Map<Integer, Integer> count = new HashMap<Integer, Integer>() {{
            put(0, 0);
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
            put(7, 0);
            put(8, 0);
            put(9, 0);
        }};

        for (int i = 1; i <= data[0]; i++) {
            for (int j = 1; j <= data[1]; j++) {
                int multiply = i * j;
                while (multiply != 0) {
                    int figure = multiply % 10;
                    count.put(figure, count.get(figure) + 1);
                    multiply /= 10;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count.size(); i++) {
            result.append(count.get(i) + "\n");
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

