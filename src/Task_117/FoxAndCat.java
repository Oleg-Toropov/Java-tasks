package Task_117;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FoxAndCat {
    public static void main(String[] args) {
        int costPurchase;

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            costPurchase = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int countCoinsCat = 0;
        int countCoinsFox = 0;

        while (costPurchase > 0) {
            if (costPurchase > 0 && costPurchase < 3) {
                countCoinsCat = 0;
                countCoinsFox = 0;
                break;
            } else if (costPurchase % 5 == 0) {
                countCoinsCat = costPurchase / 5;
                break;
            } else {
                costPurchase = costPurchase - 3;
                countCoinsFox++;
            }
        }

        String result = (countCoinsCat == 0 && countCoinsFox == 0)? "Impossible do purchase!"
                : countCoinsCat + " " + countCoinsFox;

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
