package Task_147;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SimilarArrays {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextLine().replaceAll(" ", ""));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        data.remove(0);

        char[] array1 = data.get(0).toCharArray();
        char[] array2 = data.get(1).toCharArray();
        Set<Character> setArray1 = new HashSet<>();
        Set<Character> setArray2 = new HashSet<>();
        for (char ch : array1) {
            setArray1.add(ch);
        }
        for (char ch : array2) {
            setArray2.add(ch);
        }

        String result = (setArray1.equals(setArray2)) ? "1" : "0";

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
