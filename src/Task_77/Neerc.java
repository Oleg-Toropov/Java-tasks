package Task_77;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Neerc {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))){
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int maxCountTeams = 0;
        for(int i = 1; i<=listInput.get(0); i++) {
            if (listInput.get(i) > listInput.get(listInput.size() - 1)) {
                maxCountTeams = maxCountTeams + listInput.get(listInput.size() - 1);
            } else {
                maxCountTeams = maxCountTeams + listInput.get(i);
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(maxCountTeams));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
