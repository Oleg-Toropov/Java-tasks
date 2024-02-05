package Task_19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        int countTails = 0;
        int countHeads = 0;

        try (FileReader reader = new FileReader("task-19-input.txt")){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()){
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i<listInput.size();i++){
            countTails += listInput.get(i);
        }

        countHeads = listInput.get(0) - countTails;

        String result = (countTails == countHeads || countTails < countHeads)? String.valueOf(countTails)
                : String.valueOf(countHeads);

        try (FileWriter writer = new FileWriter("task-19-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
