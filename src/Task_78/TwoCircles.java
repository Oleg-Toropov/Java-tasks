package Task_78;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoCircles {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        int ab;
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ab = (int) Math.sqrt(Math.pow((listInput.get(3) - listInput.get(0)), 2)
                + Math.pow((listInput.get(4) - listInput.get(1)), 2));

        String result = (ab > listInput.get(2) + listInput.get(5))? "NO" : "YES";

        try(FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
