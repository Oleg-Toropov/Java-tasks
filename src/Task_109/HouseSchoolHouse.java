package Task_109;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HouseSchoolHouse {
    public static void main(String[] args) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("input.txt"));
        while (sc.hasNextLine()) {
            data.add(sc.nextLine());
        }

        String result = (data.get(0).equals("School") && Integer.valueOf(data.get(1)) % 2 == 0) ? "NO" : "YES";

        FileWriter writer = new FileWriter("output.txt");
        writer.write(result);
        writer.close();
    }
}
