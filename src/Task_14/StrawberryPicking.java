package Task_14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StrawberryPicking {

    public static void main(String[] args) {
        ArrayList <Integer> listInput = new ArrayList<>();
        String str;
        int result;

        try (FileReader reader = new FileReader("task-14-input.txt")){
            Scanner scanner = new Scanner(reader);
            str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        result = listInput.get(0)+listInput.get(1)-listInput.get(2);
        String picking =  (result >= 0)? String.valueOf(result) : "Impossible";

        try (FileWriter writer = new FileWriter("task-14-output.txt")){
            writer.write(picking);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
