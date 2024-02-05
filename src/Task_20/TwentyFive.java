package Task_20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        String strInput;
        String strOutput;

        try (FileReader reader = new FileReader("task-20-input.txt")) {
            Scanner scanner = new Scanner(reader);
            strInput = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        strInput = strInput.strip();
        if (strInput.length() == 1 && strInput.equals("5")) {
            strOutput = "25";
        } else if (strInput.endsWith("5")) {
            strInput = strInput.substring(0, strInput.length() - 1);
            int a = Integer.valueOf(strInput) * (Integer.valueOf(strInput) +1);
            strOutput = String.valueOf(a) + 25;

        } else {
            strOutput = "Write correct figure";
        }

        try (FileWriter writer = new FileWriter("task-20-output.txt")){
            writer.write(strOutput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
