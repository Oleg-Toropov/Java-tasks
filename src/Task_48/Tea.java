package Task_48;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tea {
    public static void main(String[] args) {
        ArrayList<Integer> listIn = new ArrayList<>();
        int sum = 0;
        int result;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listIn.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i < listIn.size(); i++) {
            sum += listIn.get(i);
        }

        result = sum - (listIn.get(0) - 1);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
