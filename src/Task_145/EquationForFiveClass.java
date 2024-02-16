package Task_145;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class EquationForFiveClass {
    public static void main(String[] args) {
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] charEquation = data.toCharArray();
        boolean plus = true;
        int xPosition = 0;
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < charEquation.length; i++) {
            switch (i) {
                case 0:
                    if (charEquation[i] == 'x') {
                        xPosition = 1;
                    } else {
                        a = Character.getNumericValue(charEquation[i]);
                    }
                    break;
                case 1:
                    if (charEquation[i] == '-') {
                        plus = false;
                    }
                    break;
                case 2:
                    if (charEquation[i] == 'x') {
                        xPosition = 2;
                    } else {
                        b = Character.getNumericValue(charEquation[i]);
                    }
                    break;
                case 4:
                    if (charEquation[i] == 'x') {
                        xPosition = 3;
                    } else {
                        c = Character.getNumericValue(charEquation[i]);
                    }
                    break;
            }
        }

        int x = (xPosition == 3 && plus) ? a + b :
                (xPosition == 3) ? a - b :
                        (xPosition == 2 && plus) ? c - a :
                                (xPosition == 2) ? a - c :
                                        (xPosition == 1 && plus) ? c - b : b + c;


    }
}
