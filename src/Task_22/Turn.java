package Task_22;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Разворот (9%)
Время: 1 сек.
Память: 16 Мб
Сложность: 9%

Дано натуральное число N и последовательность из N элементов. Требуется вывести эту последовательность в обратном
порядке.

Формат ввода
В первой строке входного файла input.txt записано натуральное число N (N ≤ 103). Во второй строке через пробел идут
N целых чисел, по модулю не превосходящих 103 - элементы последовательности.

Формат вывода
В выходной файл output.txt выведите заданную последовательность в обратном порядке.

Примеры
Ввод	Вывод
3
1 2 3	3 2 1
 */
public class Turn {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        FileReader reader = new FileReader("task-22-input.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        for (int i = list.size() - 1; i > 0; i--) {
            output.append(list.get(i)).append(" ");
        }

        FileWriter writer = new FileWriter("task-22-output.txt");
        writer.write(output.toString());
        writer.close();
    }
}
