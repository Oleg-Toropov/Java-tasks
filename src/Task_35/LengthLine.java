package Task_35;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LengthLine {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        double result;
        int x;
        int y;

        try (FileReader reader = new FileReader("task-35-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                list.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (list.get(0) >= list.get(2)) {
            x = list.get(0) - list.get(2);
        } else {
            x = list.get(2) - list.get(0);
        }

        if (list.get(1) >= list.get(3)) {
            y = list.get(1) - list.get(3);
        } else {
            y = list.get(3) - list.get(1);
        }

        result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));


        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        String output = decimalFormat.format(result);

        try (FileWriter writer = new FileWriter("task-35-output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
