package Task_144;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<Letters> letters = new ArrayList<>();
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < data.length(); i++) {
            alphabet.indexOf(data.charAt(i));
            letters.add(new Letters(data.charAt(i), i + 1, alphabet.indexOf(data.charAt(i)) + 1));
        }

        letters.sort((x, y) -> x.nnInAlphabet - y.nnInAlphabet);

        String result = "YES";
        for (int i = 0; i < letters.size(); i++) {
            if (letters.get(i).nnInAlphabet < i + 1) {
                result = "NO";
                break;
            }
        }

        StringBuilder outputYes = new StringBuilder();
        outputYes.append(result + "\n");
        for (Letters l : letters) {
            outputYes.append(l.nnInString + " ");
        }

        StringBuilder output = (result.equals("YES")) ? outputYes : new StringBuilder(result);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(output.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Letters {
    char letter;
    int nnInString;
    int nnInAlphabet;

    public Letters(char letter, int nnInString, int nnInAlphabet) {
        this.letter = letter;
        this.nnInString = nnInString;
        this.nnInAlphabet = nnInAlphabet;
    }
}
