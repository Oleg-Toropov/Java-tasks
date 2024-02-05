package Task_61;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OneStepFromHappiness {
    public static void main(String[] args) {
        ArrayList<String> listIn = new ArrayList<>();
        ArrayList<String> listOut = new ArrayList<>();
        String out;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listIn.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        listIn.remove(0);

        for (String s : listIn) {
            String last = String.valueOf(Integer.valueOf(s) - 1);
            String next = String.valueOf(Integer.valueOf(s) + 1);
            if(last.length() < 6) {
                last = (last.length() == 5)? "0" + last
                        : (last.length() == 4)? "00" + last
                        : (last.length() == 3)? "000" + last
                        : (last.length() == 2)? "0000" + last
                        : "00000";
            }
            if(next.length() < 6) {
                next = (next.length() == 5)? "0" + next
                        : (next.length() == 4)? "00" + next
                        : (next.length() == 3)? "000" + next
                        : (next.length() == 2)? "0000" + next
                        : "00000";
            }

            System.out.println(last +" "+ s +" "+ next);

            char[] chLast = last.toCharArray();
            char[] chNext = next.toCharArray();

            int l1 = 0;
            int l2 = 0;
            int n1 = 0;
            int n2 = 0;

            for (int i = 0; i < chLast.length; i++) {
                if (i < 3) {
                    l1 += chLast[i];
                    n1 += chNext[i];
                } else {
                    l2 += chLast[i];
                    n2 += chNext[i];
                }
            }
            listOut.add((l1 == l2 || n1 == n2) ? "Yes" : "No");
        }

        out = listOut.get(0) + "\n" + listOut.get(1) + "\n" + listOut.get(2);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
