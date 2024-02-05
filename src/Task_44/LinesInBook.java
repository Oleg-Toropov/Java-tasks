package Task_44;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LinesInBook {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int allLineOnPage;
        int lineSearch;
        int numberPage;
        int numberLine;

        try (FileReader reader = new FileReader("task-44-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                list.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        allLineOnPage = list.get(0);
        lineSearch = list.get(1);

        if (lineSearch % allLineOnPage != 0) {
            numberPage = lineSearch / allLineOnPage + 1;
            numberLine = lineSearch % allLineOnPage;

        } else {
            numberPage = lineSearch / allLineOnPage;
            numberLine = lineSearch / numberPage;
        }

        String output = String.valueOf(numberPage) + " " + String.valueOf(numberLine);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(output);
    }
}
