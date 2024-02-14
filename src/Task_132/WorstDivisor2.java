package Task_132;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorstDivisor2 {
    public static void main(String[] args) {
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] chData = data.toCharArray();
        StringBuilder worstDivisor = new StringBuilder();
        worstDivisor.append("1");

        for (int i = chData.length - 1; i > 0; i--) {
            if (chData[i] == '0') {
                worstDivisor.append("0");
            } else {
                break;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(worstDivisor));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
