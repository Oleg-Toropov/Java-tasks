package Task_6;
/*
Орешки (3%)
Время: 1 сек.
Память: 16 Мб
Сложность: 3%

Белочка собрала в лесу N шишек c орешками. Белочка очень привередливо выбирала шишки, и брала только те, в
которых ровно M орешков. Также известно, что для пропитания зимой ей необходимо не менее K орешков. Определите,
хватит ли на зиму орешков белочке.

Формат ввода
Входной файл input.txt содержит три натуральных числа: N, M и K (N, M ≤ 100, K ≤ 10 000).

Формат вывода
В выходной файл output.txt выведите «YES» если белочке хватит орешков и «NO» в противном случае.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Nuts {
    public static void main(String[] args) {
        List<Integer> listInput = new ArrayList<>();
        try (FileReader reader = new FileReader("task-6-input.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String result = (listInput.get(0) * listInput.get(1) >= listInput.get(2)) ? "YES" : "NO";

        try (FileWriter writer = new FileWriter("task-6-output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


