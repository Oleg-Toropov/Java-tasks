package Task_10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Salary {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (FileReader reader = new FileReader("task-10-input.txt")){
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(listInput);
        int difference = listInput.get(listInput.size()-1) - listInput.get(0);
        String result = String.valueOf(difference);

        try (FileWriter writer = new FileWriter("task-10-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
