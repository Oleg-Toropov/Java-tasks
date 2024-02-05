package Task_50;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TimeArrive {
    public static void main(String[] args) {
        ArrayList<String> listInput1 = new ArrayList<>();
        ArrayList<Integer> listInput2 = new ArrayList<>();
        LocalTime timeArrive;
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput1.add(scanner.nextLine());
            }
            StringTokenizer st1 = new StringTokenizer(listInput1.get(0), ":");
            StringTokenizer st2 = new StringTokenizer(listInput1.get(1), " ");
            while (st1.hasMoreTokens()) {
                listInput2.add(Integer.valueOf(st1.nextToken()));
            }
            while (st2.hasMoreTokens()) {
                listInput2.add(Integer.valueOf(st2.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        timeArrive = LocalTime.of(listInput2.get(0), listInput2.get(1))
                .plusHours(listInput2.get(2))
                .plusMinutes(listInput2.get(3));

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(timeArrive.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
