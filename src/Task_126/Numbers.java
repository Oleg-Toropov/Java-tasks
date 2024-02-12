package Task_126;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        String date;
        ArrayList<Integer> listData = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            date = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < date.length(); i++) {
            listData.add(Character.getNumericValue(date.charAt(i)));
        }

        Collections.sort(listData);

        int countZero = 0;
        for (int i = 0; i < listData.size(); i++) {
            if (listData.get(i) == 0) {
                countZero++;
                listData.remove(i);
                i--;
            }
        }
        while (countZero > 0) {
            listData.add(1, 0);
            countZero--;
        }

        for (Integer i: listData) {
            output.append(i);
        }
        output.append(" ");

        listData.sort(Comparator.reverseOrder());
        for (Integer i: listData) {
            output.append(i);
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(output.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
