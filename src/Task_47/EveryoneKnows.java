package Task_47;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EveryoneKnows {
    public static void main(String[] args) {

        String result = "YES";
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            String str = scanner.nextLine();
            char[] ch = str.toCharArray();

            for (char c: ch){
                if (c == '0') {
                    result = "NO";
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
