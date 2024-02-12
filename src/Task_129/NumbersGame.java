package Task_129;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class NumbersGame {
    public static void main(String[] args) {
        Deque<Integer> data = new ArrayDeque<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.addLast(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        data.removeFirst();
        int player1 = 0;
        int player2 = 0;
        int queue = 1;

        while (data.size() > 0) {
            if (data.getFirst() >= data.getLast()) {
                if (queue == 1) {
                    player1 += data.removeFirst();
                    queue++;
                } else {
                    player2 += data.removeFirst();
                    queue--;
                }
            } else {
                if (queue == 1) {
                    player1 += data.removeLast();
                    queue++;
                } else {
                    player2 += data.removeLast();
                    queue--;
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(player1 + ":" + player2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
