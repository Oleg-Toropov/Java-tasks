package Task_93;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameTeams {
    public static void main(String[] args) {
        ArrayList<String> date = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("input.txt"))){
            while (sc.hasNextLine()) {
                date.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String shortName = date.get(0);
        date.remove(0);
        Collections.sort(date);

        String result = shortName + ": " + String.join(", ", date);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
