package Task_87;

import java.io.PrintWriter;
import java.util.Scanner;

public class CompressionOfBinarySequences {
    public static void main(String[] args) {
        System.out.println("Write number:");

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char [] chInput = input.toCharArray();

        int countZero = 0;
        for (int i = 0; i < chInput.length; i++) {
            if(chInput[i] == '0') {
                countZero++;
            } else {
                result.append(alphabet.charAt(countZero));
                countZero = 0;
            }
        }

        PrintWriter pr = new PrintWriter(System.out);
        pr.println(result);
        pr.flush();
    }
}
