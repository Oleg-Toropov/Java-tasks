package Task_38;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Phone {

    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (FileReader reader = new FileReader("task-38-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreElements()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String result = String.valueOf(listInput.get(0) * listInput.get(1)
                + (listInput.get(3) - listInput.get(0)) * listInput.get(2));

        try (FileWriter writer = new FileWriter("task-38-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
