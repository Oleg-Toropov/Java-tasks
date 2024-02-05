package Task_71;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BoltsAndNuts {
    public static void main(String[] args) {
        ArrayList<String> listDate = new ArrayList<>();
        ArrayList<Integer> listBolts = new ArrayList<>();
        ArrayList<Integer> listNuts = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listDate.add(scanner.nextLine());
            }

            StringTokenizer st1 = new StringTokenizer(listDate.get(0), " ");
            StringTokenizer st2 = new StringTokenizer(listDate.get(1), " ");
            while (st1.hasMoreTokens()) {
                listBolts.add(Integer.valueOf(st1.nextToken()));
            }
            while (st2.hasMoreTokens()) {
                listNuts.add(Integer.valueOf(st2.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int bolts = listBolts.get(0) * listBolts.get(1) / 100 * listBolts.get(2);
        int nuts = listNuts.get(0) * listNuts.get(1) / 100 * listNuts.get(2);

        int saveBolts = listBolts.get(0) - listBolts.get(0) * listBolts.get(1) / 100;
        int saveNuts = listNuts.get(0) - listNuts.get(0) * listNuts.get(1) / 100;

        int result = (saveBolts > saveNuts) ?
                (saveBolts - saveNuts) * listBolts.get(2) + bolts + nuts :
                (saveNuts - saveBolts) * listNuts.get(2) + bolts + nuts;

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
