package Task_82;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class KartingCompetition {
    public static void main(String[] args) {
        ArrayList<String> date = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> time = new ArrayList<>();
        String result;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                date.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        date.remove(0);

        for (int i = 0; i < date.size(); i++) {
            if (i % 2 == 0) {
                name.add(date.get(i));
            } else {
                String s = date.get(i);
                StringTokenizer st = new StringTokenizer(s, " ");
                int sumTime = 0;
                while (st.hasMoreTokens()) {
                    int a = Integer.valueOf(st.nextToken());
                    sumTime += a;
                }
                time.add(sumTime);
            }
        }

        int timeMin = time.get(0);
        for (Integer i: time) {
            if (i < timeMin) {
                timeMin = i;
            }
        }

        result = name.get(time.indexOf(timeMin));

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
