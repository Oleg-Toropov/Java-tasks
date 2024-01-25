package Task_3;
/*
Бисер (2%)
Время: 1 сек.
Память: 16 Мб
Сложность: 2%

В шкатулке хранится разноцветный бисер (или бусины). Все бусины имеют одинаковую форму, размер и вес.
Бусины могут быть одного из N различных цветов. В шкатулке много бусин каждого цвета.

Требуется определить минимальное число бусин, которые можно не глядя вытащить из шкатулки так,
чтобы среди них гарантированно были две бусины одного цвета.

Формат ввода
Входной файл input.txt содержит одно натуральное число N - количество цветов бусин (1 ≤ N ≤ 109).

Формат вывода
В выходной файл output.txt выведите ответ на поставленную задачу.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Beads {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("task-3-input.txt"));
             FileWriter writer = new FileWriter("task-3-output.txt")
        ) {
            int count = scanner.nextInt();
            String result = String.valueOf(count + 1);
            writer.write(result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
