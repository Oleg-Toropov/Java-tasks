package Task_8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Gulliver {

    public static void main(String[] args) {
        ArrayList <Integer> listSize = new ArrayList<>();
        int size;

        try(FileReader reader = new FileReader("task-8-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listSize.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        size = listSize.get(0)*listSize.get(0)*listSize.get(1);

        try (FileWriter writer = new FileWriter("task-8-output.txt")){
            writer.write(String.valueOf(size));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
