package Task_83;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        String result;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        if (listInput.get(0) % 2 != 0 && listInput.get(1) % 2 != 0) {
            result = (listInput.get(2) % 2 == 0 && listInput.get(3) % 2 == 0 && listInput.get(4) == 0
                    || listInput.get(2) % 2 != 0 && listInput.get(3) % 2 != 0 && listInput.get(4) == 0) ? "black"
                    : "white";

        } else {
            result = "equal";
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
