package Task_88;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> data = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("input.txt"));
        while (sc.hasNextLine()) {
            data.add(sc.nextInt());
        }
        int xB, yB;

        if (data.get(0) == data.get(2)) {
            yB = data.get(5);
            xB = data.get(0) + data.get(2) - data.get(4);
        } else {
            xB = data.get(4);
            yB = data.get(1) + data.get(3) - data.get(5);
        }

        FileWriter writer = new FileWriter("output.txt");
        writer.write(xB + " " + yB);
        writer.close();
    }
}
