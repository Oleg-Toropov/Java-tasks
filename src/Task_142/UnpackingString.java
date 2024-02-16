package Task_142;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UnpackingString {
    public static void main(String[] args) {
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] ch = data.toCharArray();

        StringBuilder number = new StringBuilder();
        ArrayList<Integer> countLetters = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>();

        for (int i = 0; i < ch.length; i++) {
            String symbol = String.valueOf(ch[i]);
            String nextSymbol = (i != ch.length - 1) ? String.valueOf(ch[i + 1]) : null;
            if (symbol.matches("\\d")) {
                number.append(symbol);
                if (nextSymbol.matches("[A-Z]")) {
                    countLetters.add(Integer.valueOf(String.valueOf(number)));
                    number.delete(0, number.length());
                }
            } else {
                if (i != ch.length - 1 && nextSymbol.matches("[A-Z]")) {
                    letters.add(symbol);
                    countLetters.add(1);
                } else {
                    letters.add(symbol);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        int tab = 0;

        for (int i = 0; i < letters.size(); i++) {
            int count = countLetters.get(i);
            while (count != 0) {
                result.append(letters.get(i));
                tab++;
                if (tab % 40 == 0) {
                    result.append("\n");
                }
                count--;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
