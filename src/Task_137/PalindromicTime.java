package Task_137;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PalindromicTime {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str, ":");
            while (st.hasMoreTokens()) {
                data.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int h = data.get(0);
        int m = data.get(1);

        if (h == m) {
            m++;
        }

        while (h != m) {
            if (m < 59) {
                m++;
            } else if (h < 23) {
                h++;
                m = 0;
            } else {
                h = 0;
                m = 0;
            }
        }

        StringBuilder hh = (String.valueOf(h).length() < 2) ? new StringBuilder("0" + h)
                : new StringBuilder(String.valueOf(h));
        StringBuilder mm = (String.valueOf(m).length() < 2) ? new StringBuilder("0" + m)
                : new StringBuilder(String.valueOf(m));
        mm.reverse();

        String result = hh + ":" + mm;

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
