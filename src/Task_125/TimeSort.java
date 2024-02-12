package Task_125;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TimeSort {
    int hour;
    int minute;
    int second;

    public TimeSort(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<TimeSort> time = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            while (sc.hasNextLine()) {
                data.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        data.remove(0);

        for (int i = 0; i < data.size(); i += 3) {
            time.add(new TimeSort(data.get(i), data.get(i + 1), data.get(i + 2)));
        }

        time.sort((x, y) -> {
            int r = x.hour - y.hour;
            if (r == 0) {
                r = x.minute - y.minute;
                if (r == 0) {
                    r = x.second - y.second;
                }
            }
            return r;
        });

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < time.size(); i++) {
            output.append(time.get(i).hour + " " + time.get(i).minute + " " + time.get(i).second + "\n");
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(output.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


