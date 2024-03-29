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
        ArrayList<Integer> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int amountCars = data.get(0);
        int amountMoney = data.get(1);
        data.remove(0);
        data.remove(0);
        Collections.sort(data);

        int countPayCars = 0;
        int costs = 0;

        for (Integer i : data) {
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
