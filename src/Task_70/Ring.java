package Task_70;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ring {
    public static void main(String[] args) {
        ArrayList<Double> listInput = new ArrayList<>();
        double r;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))){
            while (scanner.hasNextLine()) {
                listInput.add(Double.valueOf(scanner.next()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        r = Math.sqrt(Math.pow(listInput.get(1), 2) - listInput.get(0) / Math.PI);

        String output = String.format("%.3f", r);

        try (PrintWriter printWriter = new PrintWriter(new File("output.txt"))){
            printWriter.print(output);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
