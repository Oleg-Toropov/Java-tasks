package Task_45;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusTour {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIn = new ArrayList<>();
        String result = null;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {

            while (scanner.hasNextInt()){
                arrayListIn.add( scanner.nextInt());
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        for (int i = 1; i<arrayListIn.size(); i++) {
            if(arrayListIn.get(i)<=437) {
                result = "Crash" + " " + String.valueOf(i);
                break;
            } else {
                result = "No crash";
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
