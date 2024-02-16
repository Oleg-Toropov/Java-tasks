package Task_144;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Alphabet2 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("input.txt");
        Scanner sc = new Scanner(file);
        String data = sc.nextLine();

        char[] letters = new char[26];
        int index = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            letters[index] = i;
            index++;
        }

        Map<Integer, Character> lettersData = new HashMap<>();
        char[] ch = data.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            lettersData.put(i + 1, ch[i]);
        }

        List<Map.Entry<Integer, Character>> listLettersDataSort = lettersData.entrySet().stream()
                .sorted((v1, v2) -> v1.getValue().compareTo(v2.getValue()))
                .collect(Collectors.toList());

        StringBuilder numbers = new StringBuilder();
        boolean isPossible = true;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > listLettersDataSort.get(i).getValue()) {
                isPossible = false;
                break;
            } else {
                numbers.append(String.valueOf(listLettersDataSort.get(i).getKey()));
                numbers.append(" ");
            }
        }

        String result = (isPossible) ? "YES" + "\n" + String.valueOf(numbers).trim() : "NO";

        FileWriter out = new FileWriter("output.txt");
        out.write(result);
        out.close();
    }
}