package Task_107;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Board {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<Integer> size = new ArrayList<>();
        ArrayList<Character> advert = new ArrayList<>();
        ArrayList<Integer> board = new ArrayList<>();
        String result = null;

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        StringTokenizer st1 = new StringTokenizer(data.get(0), " ");
        while (st1.hasMoreTokens()) {
            size.add(Integer.valueOf(st1.nextToken()));
        }
        data.remove(0);

        for (int i = 0; i < data.size(); i++) {
            if (i < size.get(0)) {
                char[] ch = data.get(i).toCharArray();
                for (char c : ch) {
                    advert.add(c);
                }
            } else {
                StringTokenizer st2 = new StringTokenizer(data.get(i), " ");
                while (st2.hasMoreTokens()) {
                    board.add(Integer.valueOf(st2.nextToken()));
                }
            }
        }

        for (int i = 0; i < advert.size(); i++) {
            if (advert.get(i) == 'G') {
                if (board.get(i) == 2 || board.get(i) == 3 || board.get(i) == 6 || board.get(i) == 7) {
                    result = "YES";
                } else {
                    result = "NO";
                    break;
                }
            } else if (advert.get(i) == 'R') {
                if (board.get(i) == 4 || board.get(i) == 5 || board.get(i) == 6 || board.get(i) == 7) {
                    result = "YES";
                } else {
                    result = "NO";
                    break;
                }
            } else if (advert.get(i) == 'B') {
                if (board.get(i) == 1 || board.get(i) == 3 || board.get(i) == 5 || board.get(i) == 7) {
                    result = "YES";
                } else {
                    result = "NO";
                    break;
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
