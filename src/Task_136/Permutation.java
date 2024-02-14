package Task_136;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<Character> word1 = new ArrayList<>();
        ArrayList<Character> word2 = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            int index = 0;
            while (sc.hasNextLine()) {
                char[] ch = sc.next().toLowerCase().toCharArray();
                Arrays.sort(ch);
                if (index == 0) {
                    for (char c : ch) {
                        word1.add(c);
                    }
                } else {
                    for (char c : ch) {
                        word2.add(c);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String result = (word1.equals(word2)) ? "Yes" : "No";

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



