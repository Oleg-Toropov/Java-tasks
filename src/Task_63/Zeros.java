package Task_63;
/*
Нули (16%)
Время: 1 сек.
Память: 16 Мб
Сложность: 16%

Требуется найти самую длинную непрерывную цепочку нулей в последовательности нулей и единиц.

Формат ввода
В единственной строке входного файла input.txt записана последовательность нулей и единиц (без пробелов). Суммарное
количество цифр от 1 до 100.

Формат вывода
В единственную строку выходного файла output.txt нужно вывести искомую длину цепочки нулей.

Примеры
Ввод	Вывод
00101110000110	4
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zeros {
    public static void main(String[] args) {
        String input;
        int count = 0;
        int maxCount = 0;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') {
                count++;
            } else if (maxCount <= count) {
                maxCount = count;
                count = 0;
            } else if (count != 0) {
                count = 0;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(maxCount));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
