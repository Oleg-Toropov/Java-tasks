package Task_21;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Mouse {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        try (FileReader reader = new FileReader("task-21-input.txt")){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                arrayList.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String result =
                (arrayList.get(2) *2 <= arrayList.get(0) && arrayList.get(2) *2 <= arrayList.get(1))? "YES" : "NO";


        try (FileWriter writer = new FileWriter("task-21-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
