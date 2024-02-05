package Task_39;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Triangle {

    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        try (FileReader reader = new FileReader("task-39-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreElements()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(listInput);
        String output = (listInput.get(2) < (listInput.get(0) + listInput.get(1))) ? "YES" : "NO";

        try (FileWriter writer = new FileWriter("task-39-output.txt")) {
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
