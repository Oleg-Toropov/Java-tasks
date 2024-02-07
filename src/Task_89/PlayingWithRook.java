package Task_89;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PlayingWithRook {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("input.txt"));
        int x = sc.nextInt();
        int y = sc.nextInt();

        String result = (x == 1 && y == 1) ? "0" : (x == 1 || y == 1) ? "1" : (x == 2 && y == 2) ? "2" : "0";

        FileWriter writer = new FileWriter("output.txt");
        writer.write(result);
        writer.close();
    }
}
