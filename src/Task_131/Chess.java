package Task_131;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chess {
    public static void main(String[] args) {
        String lettersOnBoard = "ABCDEFGH";
        String result = null;
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Pattern pattern = Pattern.compile("[A-H][1-8]-[A-H][1-8]");
        Matcher matcher = pattern.matcher(data);

        if (matcher.matches()) {
            char[] letters = lettersOnBoard.toCharArray();
            char[] moves = data.toCharArray();
            for (int i = 0; i < letters.length; i++) {
                if (moves[0] == letters[i]) {
                    if (i > 1 && moves[3] == letters[i - 2]
                            || i < letters.length - 2 && moves[3] == letters[i + 2]) {
                        if (moves[4] == moves[1] - 1 || moves[4] == moves[1] + 1) {
                            result = "YES";
                        } else {
                            result = "NO";
                        }
                    } else if (i > 0 && moves[3] == letters[i - 1]
                            || i < letters.length - 1 && moves[3] == letters[i + 1]) {
                        if (moves[4] == moves[1] - 2 || moves[4] == moves[1] + 2) {
                            result = "YES";
                        } else {
                            result = "NO";
                        }
                    } else {
                        result = "NO";
                    }
                }
            }

        } else {
            result = "ERROR";
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
