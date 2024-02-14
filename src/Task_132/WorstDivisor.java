package Task_132;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorstDivisor {
    public static void main(String[] args) {
        int data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int worstDivisor = 1;
        int otherDivisor = 1;

        while (otherDivisor <= data) {
            otherDivisor++;
            if(data % otherDivisor == 0) {
                System.out.println(otherDivisor);
                char[] chWorstDivisor = String.valueOf(worstDivisor).toCharArray();
                char[] chOtherDivisor = String.valueOf(otherDivisor).toCharArray();
                int sumWorstDivisor = 0;
                int sumOtherDivisor = 0;

                for (char c : chWorstDivisor) {
                    sumWorstDivisor += Character.getNumericValue(c);
                }
                for (char c : chOtherDivisor) {
                    sumOtherDivisor += Character.getNumericValue(c);
                }

                if (sumOtherDivisor < sumWorstDivisor) {
                    worstDivisor = otherDivisor;
                } else if (sumOtherDivisor == sumWorstDivisor && otherDivisor > worstDivisor) {
                    worstDivisor = otherDivisor;
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(worstDivisor));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
