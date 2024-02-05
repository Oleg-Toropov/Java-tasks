package Task_55;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        String result = "Not common divider";
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(list);

        for (int i = list.get(0) - 1; i > 0; i--) {
            if (list.get(0) % i == 0 && list.get(1) % i == 0) {
                result = String.valueOf(i);
                break;
            }
        }
        System.out.println(result);
    }
}
