package Task_138;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Traps {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        data.remove(0);
        data.add("0 0");

        int x = 0, y = 0, xPrev = 0, yPrev = 0;
        double lengthPath = 0;

        for (String s : data) {
            StringTokenizer st = new StringTokenizer(s, " ");
            while (st.hasMoreTokens()) {
                x = Integer.valueOf(st.nextToken());
                y = Integer.valueOf(st.nextToken());
            }
            lengthPath += Math.sqrt(Math.pow(x - xPrev, 2) + Math.pow(y - yPrev, 2));
            xPrev = x;
            yPrev = y;
        }

        String result = String.format("%.3f", lengthPath);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
