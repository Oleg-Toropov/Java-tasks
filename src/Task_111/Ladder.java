package Task_111;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        int data;
        int stepHeight = 0;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))){
            data = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i <=data; i++){
            if (data>=i) {
                data = data - i;
                stepHeight = i;
            }
        }
        System.out.println(stepHeight);

    }


}
