package Task_66;
/*
Кругляши (16%)
Время: 1 сек.
Память: 16 Мб
Сложность: 16%

Однажды в просторах рунета появился следующий ребус:

157892 = 3
203516 = 2
409578 = 4
236271 = ?
Никто так и не смог его разгадать. Позже оказалось, что число в правом столбце равно сумме "кругляшей", которые есть
в цифрах числа, расположенного слева. Ваша задача написать программу, которая определяет, сколько кругляшей в числе.

Формат ввода
Во входном файле input.txt записано целое число N (0 ≤ N ≤ 10100).

Формат вывода
В выходной файл output.txt выведите одно число – количество кругляшей в числе N.

Примеры
Ввод	Вывод
157892	3
203516	2
409578	4
236271	1
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Roundels {
    public static void main(String[] args) {
        String input;
        int result = 0;
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] ch = input.toCharArray();

        for (char c : ch) {
            if (c == '0' || c == '6' || c == '9') {
                result = result + 1;
            } else if (c == '8') {
                result = result + 2;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
