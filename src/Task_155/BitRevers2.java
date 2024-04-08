package Task_155;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class BitRevers2 {
    public static void main(String[] args) {
        long data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String dataSystemTwo = new BigInteger(String.valueOf(data)).toString(2);

        char[] ch = dataSystemTwo.toCharArray();
        StringBuilder reversDate = new StringBuilder();
        for (int i = ch.length - 1; 0 <= i; i--) {
            reversDate.append(String.valueOf(ch[i]));
        }

        String reversNumber = reversDate.length() > 0 ? String.valueOf(reversDate) : "0";
        BigInteger reversSystemTen = new BigInteger(reversNumber, 2);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(reversSystemTen));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}