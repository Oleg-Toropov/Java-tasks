package Task_37;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HappyTicket {
    public static void main(String[] args) {

        int firstSum = 0;
        int secondSum = 0;

        try (FileReader reader = new FileReader("task-37-input.txt");
             FileWriter writer = new FileWriter("task-37-output.txt")) {
            Scanner scanner = new Scanner(reader);
            String str1 = scanner.nextLine();
            char[] array = str1.toCharArray();
            int a = 0;

            /*
            str = sc.nextLine();
            char[] symbols = str.toCharArray();
            for (char symbol : symbols) {
            data.add(Character.getNumericValue(symbol));
            */

            while (a < array.length) {
                String str2 = String.valueOf(array[a]);
                if (a < 3) {
                    firstSum += Integer.valueOf(str2);
                } else {
                    secondSum += Integer.valueOf(str2);
                }
                a++;
            }
            String output = (firstSum == secondSum) ? "YES" : "NO";
            writer.write(output);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
