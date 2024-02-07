package Task_95;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Details {
    public static void main(String[] args) {
        ArrayList<String> date = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                date.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        date.remove(0);
        ArrayList<Integer> countPoints = new ArrayList<>();

        for (String s : date) {
            char[] ch = s.toCharArray();
            int count = 0;
            for (char c : ch) {
                if (c == '.') {
                    count += 1;
                }
            }
            countPoints.add(count);
        }

        Collections.sort(countPoints);
        String result = String.valueOf(countPoints.get(0));

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
