package Task_64;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BusNumbers {
    public static void main(String[] args) {
        ArrayList<String> listInput = new ArrayList<>();
        ArrayList<String> listResult = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        listInput.remove(0);

        for (String s : listInput) {
            if (Pattern.matches("[A-C|E|H|K|M|O|P|T|X|Y][0-9][0-9][0-9]" +
                    "[A-C|E|H|K|M|O|P|T|X|Y][A-C|E|H|K|M|O|P|T|X|Y]", s)) {
                listResult.add("Yes");
            } else {
                listResult.add("No");
            }
        }

        for (String s : listResult) {
            output.append(s + "\n");
        }
        System.out.println(output);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(output.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
