package Task_105;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CutePattern {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String result = "YES";

        for (int i = 0; i < data.size() - 1; i++) {
            char[] ch1 = data.get(i).toCharArray();
            char[] ch2 = data.get(i + 1).toCharArray();
            for (int j = 0; j < ch1.length - 1; j++) {
                if(ch1[j] == ch1[j+1] && ch2[j] == ch2[j+1] && ch1[j] == ch2[j] ) {
                    result = "NO";
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
