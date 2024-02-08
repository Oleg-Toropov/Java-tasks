package Task_106;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        double maxTax = 0;
        int number = 1;

        for (int i = 1; i < data.size() - data.get(0); i++) {
            double income = data.get(i);
            double percent = data.get(i + data.get(0));
            double tax = income * percent / 100;

            if (tax > maxTax) {
                maxTax = tax;
                number = i;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(number));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
