package Task_113;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SeaFight {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        StringTokenizer st = new StringTokenizer(data.get(0));
        int[] size = new int[2];
        for (int i = 0; i <= st.countTokens(); i++) {
            size[i] = Integer.valueOf(st.nextToken());

        }

        data.remove(0);

        char[][] location = new char[size[0]][size[1]];
        for (int i = 0; i < data.size(); i++) {
            char[] ch = data.get(i).toCharArray();
            for (int j = 0; j < location[i].length; j++) {
                location[i][j] = ch[j];
            }
        }

        int countPlace = 0;

        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location[i].length; j++) {
                if (location[i][j] == '.') {
                    if (i - 1 >= 0 && location[i - 1][j] != '.') {
                        continue;
                    }
                    if (i + 1 < location.length && location[i + 1][j] != '.') {
                        continue;
                    }
                    if (j - 1 >= 0 && location[i][j - 1] != '.') {
                        continue;
                    }
                    if (j + 1 < location[i].length && location[i][j + 1] != '.') {
                        continue;
                    }
                    countPlace++;
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(countPlace));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


