package Task_103;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exams {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int mf = Math.abs(data.get(0) - data.get(3) - (data.get(1) + data.get(2)));
        int m = data.get(1) - mf;
        int f = data.get(2) - mf;

        String result = mf + " " + m + " " + f;

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
