package Task_32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StateMachines {

    public static void main(String[] args) {
        int d, n, m;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listResult = new ArrayList<>();

        try (FileReader reader = new FileReader("task-32-input.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i < list.size(); i = i + 2) {
            n = list.get(i);
            m = list.get(i + 1);
            d = 19 * m + (n + 239) * (n + 366) / 2;
            listResult.add(d);
        }

        try (FileWriter writer = new FileWriter("task-32-output.txt")) {
            for (int i : listResult) {
                writer.write(i +"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
