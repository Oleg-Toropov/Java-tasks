package Task_108;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LazyPerson {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Integer> resulMatches = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        data.remove(0);
        int minDate = data.get(0);
        int maxDate = data.get(0);

        for (Integer i : data) {
            if(minDate > i) {
                minDate = i;
            }
            if(maxDate < i) {
                maxDate = i;
            }
        }

        for (int i = 0; i < data.size() - 1; i = i + 2) {
            int match = 0;
            for (int j = minDate; j <= maxDate; j++) {
                if (data.get(i) == j || data.get(i + 1) == j) {
                    match++;
                }
            }
            resulMatches.add(match);
        }

        String result = "YES";

        for (Integer i : resulMatches) {
            if (i == 0) {
                result = "NO";
                break;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
