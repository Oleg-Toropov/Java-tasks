package Task_135;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Clothes {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        Map<Integer, Integer> colorAndCount = new LinkedHashMap<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
                while (st.hasMoreTokens()) {
                    data.add(Integer.valueOf(st.nextToken()));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        data.remove(0);

        for (Integer i : data) {
            int count = 1;
            if (colorAndCount.containsKey(i)) {
                count = colorAndCount.get(i);
                count++;
            }
            colorAndCount.put(i, count);
        }

        List<Map.Entry<Integer, Integer>> list = colorAndCount.entrySet().stream()
                .sorted((v1, v2) -> v1.getValue().compareTo(v2.getValue()))
                .collect(Collectors.toList());

        int max = list.get(list.size() - 1).getValue();
        int prev = (list.size() > 1) ? list.get(list.size() - 2).getValue() : 0;
        int result = (max == prev) ? 0 : list.get(list.size() - 1).getKey();

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
