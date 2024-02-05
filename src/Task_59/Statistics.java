package Task_59;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {


    static public ArrayList<Integer> input() {
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void output(String st) {

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(st);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> listInput = input();
        StringBuilder three = new StringBuilder();
        StringBuilder four = new StringBuilder();

        for (Integer i : listInput) {

            if (i % 2 == 0) {
                four.append(i + " ");
            } else {
                three.append(i + " ");
            }
        }

        String result = (three.length() <= four.length()) ? "NO" : "YES";

        String output = three.toString() + "\n" + four.toString() + "\n" + result;
        output(output);
    }
}
