package Task_26;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GoldSand {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> listCost = new ArrayList<>();
        ArrayList<Integer> listSize = new ArrayList<>();
        int price = 0;

        FileReader reader = new FileReader("task-26-input.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextInt()) {
            if (listCost.size() < 3) {
                listCost.add(scanner.nextInt());
            } else {
                listSize.add(scanner.nextInt());
            }
        }

        Collections.sort(listCost);
        Collections.sort(listSize);

        for (int i = 0; i < listCost.size(); i++) {
            price += listCost.get(i) * listSize.get(i);
        }

        FileWriter writer = new FileWriter("task-26-output.txt");
        writer.write(String.valueOf(price));
        System.out.println(price);
        writer.close();
    }
}
