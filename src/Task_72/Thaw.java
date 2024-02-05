package Task_72;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Thaw {

    static public ArrayList<Integer> read (String fileInput, ArrayList<Integer> listInput) {
        try (Scanner scanner = new Scanner(new FileReader(fileInput))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return listInput;
    }

    static public int countDays (ArrayList<Integer> listInput) {
        int countDays = 0;
        int maxCountDays = 0;
        for (int i = 1; i < listInput.size(); i++) {
            if (listInput.get(i) > 0) {
                countDays++;
            } else {
                if (maxCountDays < countDays) {
                    maxCountDays = countDays;
                }
                countDays = 0;
            }
        }
        return maxCountDays;
    }

    static public void write (String fileOutput, int maxCountDays) {
        try (FileWriter writer = new FileWriter(fileOutput)){
            writer.write(String.valueOf(maxCountDays));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        String input = "input.txt";
        String output = "output.txt";
        ArrayList<Integer> listInput = new ArrayList<>();
        int maxCountDays;

        read(input, listInput);
        maxCountDays = countDays(listInput);
        write(output,maxCountDays);

    }
}
