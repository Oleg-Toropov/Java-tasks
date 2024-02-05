package Task_24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Aliens {
    public static void main(String[] args) {
        List <Integer> listInput = new ArrayList<>();

        try (FileReader reader = new FileReader("task-24-input.txt")){
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String output = (listInput.get(0) >= listInput.get(1) + listInput.get(2)) ? "YES" : "NO";

        try (FileWriter writer = new FileWriter("task-24-output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
