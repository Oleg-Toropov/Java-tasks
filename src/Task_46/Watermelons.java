package Task_46;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Watermelons {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))){
            while (scanner.hasNextLine()) {
                list.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        list.remove(0);
        Collections.sort(list);
        String out = list.get(0) + " " + list.get(list.size()-1);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
