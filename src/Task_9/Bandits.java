package Task_9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bandits {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (FileReader reader = new FileReader("task-9-input.txt");
             FileWriter writer = new FileWriter("task-9-output.txt")) {

            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }

            int allCansGarry = listInput.get(1) - 1;
            int allCansLarry = listInput.get(0) - 1;
            String result = String.valueOf(allCansGarry) + " " + String.valueOf(allCansLarry);

            writer.write(result);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }






    }


}
