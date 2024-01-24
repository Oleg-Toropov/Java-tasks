package Task_2;
/*
A+B (2%)
        Время: 1 сек.
        Память: 16 Мб
        Сложность: 2%
        Требуется сложить два целых числа А и В.

        Формат ввода
        В единственной строке входного файла input.txt записаны два натуральных числа через пробел.
        Значения чисел не превышают 109.

        Формат вывода
        В единственную строку выходного файла output.txt нужно вывести одно целое число — сумму чисел А и В.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("task-2-input.txt"));
             FileWriter writer = new FileWriter("task-2-output.txt")
        ) {
            int result = 0;
            while (scanner.hasNextInt()) {
                result += scanner.nextInt();
            }
            System.out.println(result);
            String st = String.valueOf(result);
            writer.write(st);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
