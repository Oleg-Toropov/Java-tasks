package Task_27;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Parallelepiped {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();



        try (FileReader reader = new FileReader("task-27-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int a = listInput.get(0);
        int b = listInput.get(1);
        int c = listInput.get(2);

        int s = 2*(a*b+a*c+b*c);
        int v = a*b*c;

        String output = s + " " + v;

        try (FileWriter writer = new FileWriter("task-27-output.txt")){
           writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
