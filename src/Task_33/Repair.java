package Task_33;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Repair {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try (FileReader reader = new FileReader("task-33-input.txt")) {
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

        int aria = list.get(0) * list.get(2) * 2 + list.get(1) * list.get(2) * 2;
        String result = (aria < 16)?"1": String.valueOf(aria/16);
        if (aria%16 !=0) {
            result = String.valueOf(aria/16 + 1);
        }

        try (FileWriter writer = new FileWriter("task-33-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
