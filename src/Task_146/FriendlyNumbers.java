package Task_146;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FriendlyNumbers {
    public static void main(String[] args) {
        ArrayList <String> data = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))){
            while (sc.hasNextLine()) {
                data.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        data.remove(0);
        StringBuilder results = new StringBuilder();

        for (String s: data) {
            StringTokenizer st = new StringTokenizer(s, " ");
            char[] word1 = st.nextToken().toCharArray();
            char[] word2 = st.nextToken().toCharArray();
            Set<Character> setWord1 = new HashSet<>();
            Set<Character> setWord2 = new HashSet<>();
            for (char ch: word1) {
                setWord1.add(ch);
            }
            for (char ch: word2) {
                setWord2.add(ch);
            }
            String result = (setWord1.equals(setWord2))? "YES" : "NO";
            results.append(result + "\n");
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(results.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
