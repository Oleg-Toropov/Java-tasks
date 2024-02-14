package Task_140;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HoppingTrip {
    public static void main(String[] args) {
        int[] frog = new int[2];
        int l = 0;
        ArrayList<int[]> coordinates = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("input.txt"))){
            int index = 0;
            while (sc.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
                while (st.hasMoreTokens()){
                    if(index == 0){
                        int n = Integer.valueOf(st.nextToken());
                        frog = new int[]{Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken())};
                        l = Integer.valueOf(st.nextToken());
                    } else {
                        coordinates.add(new int[] {Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken())});
                    }
                    index++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int pointNumber = 1;
        String result = "Yes";
        for (int[] i: coordinates){
           double d = Math.sqrt(Math.pow(frog[0] - i[0], 2) + Math.pow(frog[1] - i[1], 2));
           if (d <= l) {
               result = "No";
               break;
           }
           pointNumber++;
        }

        String output = (result.equals("Yes"))? result: String.valueOf(pointNumber);

        try(FileWriter writer = new FileWriter("output.txt")) {
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
