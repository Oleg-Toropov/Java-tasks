package Task_91;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boxes {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<Integer> sizeBoxA = new ArrayList<>();
        ArrayList<Integer> sizeBoxB = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextLine());
            }
            StringTokenizer stA = new StringTokenizer(data.get(0));
            while (stA.hasMoreTokens()) {
                sizeBoxA.add(Integer.valueOf(stA.nextToken()));
            }
            StringTokenizer stB = new StringTokenizer(data.get(1));
            while (stB.hasMoreTokens()) {
                sizeBoxB.add(Integer.valueOf(stB.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(sizeBoxA);
        Collections.sort(sizeBoxB);

        String result = (sizeBoxA.get(0) == sizeBoxB.get(0) && sizeBoxA.get(1) == sizeBoxB.get(1)
                && sizeBoxA.get(2) == sizeBoxB.get(2)) ? "Boxes are equal"
                :(sizeBoxA.get(0) <= sizeBoxB.get(0) && sizeBoxA.get(1) <= sizeBoxB.get(1)
                && sizeBoxA.get(2) <= sizeBoxB.get(2))? "The first box is smaller than the second one"
                :(sizeBoxA.get(0) >= sizeBoxB.get(0) && sizeBoxA.get(1) >= sizeBoxB.get(1)
                && sizeBoxA.get(2) >= sizeBoxB.get(2))? "The first box is larger than the second one"
                : "Boxes are incomparable";


        System.out.println(result);
    }
}
