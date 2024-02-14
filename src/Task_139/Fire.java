package Task_139;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Fire {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
                while (st.hasMoreTokens()) {
                    data.add(Integer.valueOf(st.nextToken()));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        data.remove(0);
        int timeFire = data.remove(0);

        int allTime = 0;
        for (Integer i : data) {
            allTime += i - 1;
        }

        String result = (timeFire == allTime)? "yes" : "no";

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
