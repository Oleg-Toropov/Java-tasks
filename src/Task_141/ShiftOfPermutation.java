package Task_141;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ShiftOfPermutation {
    public static void main(String[] args) {
        Deque<Integer> data = new ArrayDeque<>();
        int min;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
                while (st.hasMoreTokens()) {
                    data.addLast(Integer.valueOf(st.nextToken()));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        data.removeFirst();
        min = data.stream().min((x, y) -> x.compareTo(y)).get();
        while (data.getFirst() != min) {
            data.addFirst(data.removeLast());
        }

        StringBuilder result = new StringBuilder();
        for (Integer i: data) {
            result.append(i);
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
