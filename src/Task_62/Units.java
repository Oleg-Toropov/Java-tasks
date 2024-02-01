package Task_62;
/*
Единицы (16%)
Время: 1 сек.
Память: 16 Мб
Сложность: 16%

На уроках информатики вас, наверное, учили переводить числа из одних систем счисления в другие и выполнять другие
подобные операции. Пришло время продемонстрировать эти знания. Найдите количество единиц в двоичной записи заданного
числа.

Формат ввода
Во входном файле input.txt записано целое число n (0 ≤ n ≤ 2×109).

Формат вывода
В единственную строку выходного файла output.txt нужно вывести одно целое число — количество двоичных единиц в
записи числа n.

Примеры
Ввод	Вывод
5	    2
7	    3
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        int result = 0;
        int number;
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            number = scanner.nextInt();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (number > 0) {
            if (number % 2 == 1) {
                result++;
                number = number / 2;
            } else {
                number = number / 2;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
