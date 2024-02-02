package Task_68;
/*
Числа Фибоначчи (16%)
Время: 1 сек.
Память: 16 Мб
Сложность: 16%

Последовательностью Фибоначчи называется последовательность чисел a0, a1, ..., an, ..., где a0 = 0, a1 = 1,
ak = ak-1 + ak-2 (k > 1).

Требуется найти N-е число Фибоначчи.

Формат ввода
Во входном файле input.txtзаписано целое число N (0 ≤ N ≤ 30).

Формат вывода
В выходной файл output.txt выведите N-е число Фибоначчи.

Примеры
Ввод	Вывод
7	    13
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int input;
        int a = 0;
        int b = 1;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (input - 1 > 0) {
            int c = b + a;
            a = b;
            b = c;
            input--;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(b));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
