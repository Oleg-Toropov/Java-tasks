package Task_131;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Chess {
    public static void main(String[] args) {
        Map<Character, Integer> field = IntStream.rangeClosed('A', 'H')
                .boxed()
                .collect(Collectors.toMap(
                        x -> (char) x.intValue(),
                        x -> x + (1 - 'A')));

        String result = null;
        String data;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            data = sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        if (data.matches("[A-H][1-8]-[A-H][1-8]")) {
            char[] ch = data.toCharArray();
            ArrayList<Integer> moves = new ArrayList<>();
            for (char c: ch){
                if (field.containsKey(c)) {
                    moves.add(field.get(c));
                } else if (c == '-'){
                    continue;
                } else {
                    moves.add(Character.getNumericValue(c));
                }
            }

            result = (Math.abs((moves.get(0) - moves.get(2)) * (moves.get(1) - moves.get(3))) == 2)? "YES" : "NO";

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
