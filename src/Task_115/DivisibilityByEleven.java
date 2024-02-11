package Task_115;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DivisibilityByEleven {
    public static void main(String[] args) {
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] number = data.toCharArray();

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 0) {
                sumEven += Character.getNumericValue(number[i]);
            } else {
                sumOdd += Character.getNumericValue(number[i]);
            }
        }

        String result = ((Math.abs(sumEven - sumOdd))% 11 == 0) ? "YES" : "NO";

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
