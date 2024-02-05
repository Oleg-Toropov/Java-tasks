package Task_13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        ArrayList<Integer> team_A = new ArrayList<>();
        ArrayList<Integer> team_B = new ArrayList<>();
        int a = 0;
        int b = 0;
        String result;

        try (FileReader reader = new FileReader("task-13-input.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()) {
                listInput.add(scanner.nextInt());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < listInput.size(); i++) {
            if (i % 2 == 0) {
                team_A.add(listInput.get(i));
            } else {
                team_B.add(listInput.get(i));
            }
        }

        for (Integer s : team_A) {
            a += s;
        }
        for (Integer s : team_B) {
            b += s;
        }

        result = (a>b)? "1" : (a<b)? "2" : "DRAW";

        try (FileWriter writer = new FileWriter("task-13-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
