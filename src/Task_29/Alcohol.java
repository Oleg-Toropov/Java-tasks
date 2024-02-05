package Task_29;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Alcohol {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        String output;
        try (FileReader reader = new FileReader("task-29-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                list.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (list.get(0) >= 2 && list.get(1) >= 6 && list.get(2) >= 1) {
            list1.add(list.get(0) / 2);
            list1.add(list.get(1) / 6);
            list1.add(list.get(2) / 1);
            Collections.sort(list1);
            output = String.valueOf(list1.get(0));
        } else {
            output = "0";
        }

        try (FileWriter writer = new FileWriter("task-29-output.txt")) {
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
