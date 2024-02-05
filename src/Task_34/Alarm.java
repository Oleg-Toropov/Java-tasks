package Task_34;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Alarm {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int result;
        FileReader reader = new FileReader("task-34-input.txt");
        Scanner scanner = new Scanner(reader);
        String str = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        if (list.get(0) < list.get(1)) {
            result = list.get(1) - list.get(0);
        } else {
            result = 12 - list.get(0) + list.get(1);
        }

        FileWriter writer = new FileWriter("task-34-output.txt");
        writer.write(String.valueOf(result));
        writer.close();
    }
}
