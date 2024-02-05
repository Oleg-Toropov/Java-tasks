package Task_17;

import java.io.*;
import java.util.*;

public class ThreeFatMen {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String result;
        try (FileReader reader= new FileReader("task-17-input.txt")){
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                list.add(Integer.valueOf(st.nextToken()));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(list);

        result = (list.get(0) < 94 || list.get(list.size()-1) >727)? "Error" : String.valueOf(list.get(list.size()-1));

        try (FileWriter writer = new FileWriter("task-17-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
