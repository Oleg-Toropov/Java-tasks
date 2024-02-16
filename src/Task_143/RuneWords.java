package Task_143;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RuneWords {
    public static void main(String[] args) {
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] symbols = data.toCharArray();
        int count = 1;
        for (int i = 0; i < symbols.length; i++) {
            String str = String.valueOf(symbols[i]);

            if (i == 0 && str.matches("[a-z]")
                    || i == symbols.length - 1 && str.matches("[A-Z]")) {
                count = 0;
                break;
            }

            if (str.matches("[A-Z]")) {
                count = 1;
            } else {
                count++;
            }

            if (i != symbols.length - 1 && String.valueOf(symbols[i + 1]).matches("[A-Z]") ||
                    i == symbols.length - 1) {
                if (count < 2 || count > 4) {
                    count = 0;
                    break;
                }
            }
        }

        String result = (count == 0) ? "No" : "Yes";

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
