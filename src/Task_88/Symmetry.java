package Task_88;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> date = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("input.txt"));
        while (sc.hasNextLine()) {
            date.add(sc.nextInt());
        }
        int xB, yB;

        if (date.get(0) == date.get(2)) {
            yB = date.get(5);
            xB = date.get(0) + date.get(2) - date.get(4);
        } else {
            xB = date.get(4);
            yB = date.get(1) + date.get(3) - date.get(5);
        }

        FileWriter writer = new FileWriter("output.txt");
        writer.write(xB + " " + yB);
        writer.close();
    }
}
