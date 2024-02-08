package Task_92;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        ArrayList<Character> data = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                String s = sc.next();
                char[] ch = s.toCharArray();
                for (char c : ch) {
                    data.add(c);
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String player1 =
                (data.get(0) == 'X' && data.get(1) == 'X' && data.get(2) == 'X'
                        || data.get(3) == 'X' && data.get(4) == 'X' && data.get(5) == 'X'
                        || data.get(6) == 'X' && data.get(7) == 'X' && data.get(8) == 'X'
                        || data.get(0) == 'X' && data.get(3) == 'X' && data.get(6) == 'X'
                        || data.get(1) == 'X' && data.get(4) == 'X' && data.get(7) == 'X'
                        || data.get(2) == 'X' && data.get(5) == 'X' && data.get(8) == 'X'
                        || data.get(0) == 'X' && data.get(4) == 'X' && data.get(8) == 'X'
                        || data.get(2) == 'X' && data.get(4) == 'X' && data.get(6) == 'X') ? "Win" :
                        (data.get(0) == 'O' && data.get(1) == 'O' && data.get(2) == 'O'
                                || data.get(3) == 'O' && data.get(4) == 'O' && data.get(5) == 'O'
                                || data.get(6) == 'O' && data.get(7) == 'O' && data.get(8) == 'O'
                                || data.get(0) == 'O' && data.get(3) == 'O' && data.get(6) == 'O'
                                || data.get(1) == 'O' && data.get(4) == 'O' && data.get(7) == 'O'
                                || data.get(2) == 'O' && data.get(5) == 'O' && data.get(8) == 'O'
                                || data.get(0) == 'O' && data.get(4) == 'O' && data.get(8) == 'O'
                                || data.get(2) == 'O' && data.get(4) == 'O' && data.get(6) == 'O') ? "Lose" : "Draw";

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(player1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

