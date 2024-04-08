package Task_154;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SimpleSorting {
    static long s(long ai, int k) {
        long s = 0;
        while (ai > 0) {
            s += ai % k;
            ai /= k;
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 0, k1 = 0, k2 = 0;
        ArrayList<Long> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            int index = 0;
            while (sc.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
                while (st.hasMoreTokens()) {
                    if (index == 0) {
                        n = Integer.valueOf(st.nextToken());
                        k1 = Integer.valueOf(st.nextToken());
                        k2 = Integer.valueOf(st.nextToken());
                        index++;
                    } else {
                        data.add(Long.valueOf(st.nextToken()));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList <Long> listBi = new ArrayList<>();
        for (long l : data) {
            long bi = s(l, k1) * s(l, k2);
            listBi.add(bi);
        }

        listBi.sort((x, y) -> x.compareTo(y));
        System.out.println(listBi);
    }
}
