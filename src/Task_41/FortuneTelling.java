package Task_41;
/*
Гадание (13%)
Время: 1 сек.
Память: 16 Мб
Сложность: 13%

Как и многие другие девочки, Маша любит разные гадания. Некоторое время назад Маша узнала новый способ гадать на числах
– для какого-нибудь интересующего ее натурального числа n надо посчитать сумму всех чисел, на которые n делится без
остатка. Маша не очень любит арифметику, и попросила вас написать программу, которая автоматизирует процесс гадания.

Формат ввода
В единственной строке входного файла input.txt записано натуральное число n (n ≤ 1000), которое Маша была вынуждена
сообщить.

Формат вывода
В выходной файл output.txt выведите сумму всех натуральных делителей числа n.

Примеры
Ввод	Вывод
6	12
10	18
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FortuneTelling {
    public static void main(String[] args) {
        int input;
        int result = 0;

        try (FileReader reader = new FileReader("task-41-input.txt")) {
            Scanner scanner = new Scanner(reader);
            input = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                result += i;
            }
        }

        try (FileWriter writer = new FileWriter("task-41-output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
