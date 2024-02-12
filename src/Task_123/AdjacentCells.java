package Task_123;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdjacentCells {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            n = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int a = 0, b = 0;
        int count = 1;
        int[][] chessBoard = new int[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = count;
                count++;
                if (n == chessBoard[i][j]) {
                    a = i;
                    b = j;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (a - 1 >= 0) {
            result.add(chessBoard[a - 1][b]);
        }
        if (a + 1 < chessBoard.length) {
            result.add(chessBoard[a + 1][b]);
        }
        if (b - 1 >= 0) {
            result.add(chessBoard[a][b - 1]);
        }
        if (b + 1 < chessBoard[a].length) {
            result.add(chessBoard[a][b + 1]);
        }

        result.sort((x, y) -> x.compareTo(y));

        StringBuilder output = new StringBuilder();
        for (Integer i : result) {
            output.append(i + " ");
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(output.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
