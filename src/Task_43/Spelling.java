package Task_43;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Spelling {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder word;
        try (FileReader reader = new FileReader("task-43-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                list.add(st.nextToken());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (list.size() > 1) {
            word = new StringBuilder(list.get(1));
            word.deleteCharAt(Integer.valueOf(list.get(0)) - 1);
        } else {
            word = new StringBuilder("Write a word");
        }

        try (FileWriter writer = new FileWriter("task-43-output.txt")) {
            writer.write(word.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
