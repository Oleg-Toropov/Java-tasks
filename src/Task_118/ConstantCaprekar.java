package Task_118;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConstantCaprekar {
    public static void main(String[] args) {
        int data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int count = 0;

        while (data != 6174){
            String strData = String.valueOf(data);
            ArrayList<Character> b = new ArrayList<>();
            ArrayList<Character> a = new ArrayList<>();
            for (int i = 0; i < strData.length(); i++) {
                b.add(strData.charAt(i));
                a.add(strData.charAt(i));
            }

            b.sort((x, y) -> -x.compareTo(y));
            a.sort((x, y) -> x.compareTo(y));

            StringBuilder b1 = new StringBuilder();
            StringBuilder a1 = new StringBuilder();
            for (int i = 0; i < b.size(); i++) {
                b1.append(b.get(i));
                a1.append(a.get(i));
            }

            int b2 = Integer.valueOf(String.valueOf(b1));
            int a2 = Integer.valueOf(String.valueOf(a1));
            data = b2 - a2;
            count++;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(data + "\n" + count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
