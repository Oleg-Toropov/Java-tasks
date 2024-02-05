package Task_75;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MishaAndNegativePhoto {
    public static void main(String[] args) {
        ArrayList <String> listInput = new ArrayList<>();
        ArrayList <Integer> listSize = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))){
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        StringTokenizer st1 = new StringTokenizer(listInput.get(0), " ");
        while (st1.hasMoreTokens()) {
            listSize.add(Integer.valueOf(st1.nextToken()));
        }

        int high = listSize.get(0);
        listInput.remove(0);
        listInput.remove(high);

        int countMistakes = 0;

        for (int i = 0; i < high; i++) {
            char[] ch1 = listInput.get(i).toCharArray();
            char[] ch2 = listInput.get(i+high).toCharArray();
            for (int j = 0; j < ch1.length; j++) {
                if (ch1[j] == ch2[j]) {
                    countMistakes++;
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(countMistakes));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
