package Task_114;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LastFigure {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))){
            a = Integer.valueOf(sc.nextInt());
            b = Integer.valueOf(sc.nextInt());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        c = (int) Math.pow(a, b);
        String str = String.valueOf(c);
        char result = str.charAt(str.length()-1);
        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
