package Task_96;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CrisisBusiness {
    public static void main(String[] args) {
        ArrayList<Integer> date = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                date.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int amountCars = date.get(0);
        int amountMoney = date.get(1);
        date.remove(0);
        date.remove(0);
        Collections.sort(date);

        int countPayCars = 0;
        int costs = 0;

        for (Integer i : date) {
            if (costs + i <= amountMoney && countPayCars <= amountCars) {
                costs +=i;
                countPayCars++;
            }else {
                break;
            }
        }

        try(FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(countPayCars));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
