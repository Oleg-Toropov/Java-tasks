package Task_69;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChessField {

    static String color(ArrayList<Integer> list) {
        ArrayList<String> color = new ArrayList<>();
        for (int i = 0; i < list.size(); i = i + 2) {
            if (list.get(i) % 2 == 0 && list.get(i + 1) % 2 == 0
                    || list.get(i) % 2 == 1 && list.get(i + 1) % 2 == 1) {
                color.add("black");
            } else {
                color.add("white");
            }
        }
        String result = (color.get(0).equals(color.get(1))) ? "YES" : "NO";
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String output = color(listInput);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
