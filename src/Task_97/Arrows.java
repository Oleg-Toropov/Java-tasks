package Task_97;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arrows {
    public static void main(String[] args) {

        String date;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            date = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int count = 0;

        Pattern pattern = Pattern.compile("(?=(<--<<)|(>>-->))");
        Matcher matcher = pattern.matcher(date);
        while (matcher.find()) {
            count++;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(count));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
