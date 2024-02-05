package Task_16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cranes {

    static ArrayList<String> decision(int a) {
        ArrayList<String> list = new ArrayList<>();
        int p, k, s;
        String error;
        if (a % 6 == 0) {
            p = a / 3 / 2;
            s = p;
            k = (p + s) * 2;
            list.add(String.valueOf(p));
            list.add(String.valueOf(k));
            list.add(String.valueOf(s));
        } else {
            error = "Writing a correct number";
            list.add(error);
        }
        return list;
    }

    public static void main(String[] args) {
        int input;
        ArrayList<String> listResult = new ArrayList<>();
        try (FileReader reader = new FileReader("task-16-input.txt")) {
            Scanner scanner = new Scanner(reader);
            input = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        listResult = decision(input);

        try (FileWriter writer = new FileWriter("task-16-output.txt")){
            for (String s : listResult) {
                writer.write(s + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
