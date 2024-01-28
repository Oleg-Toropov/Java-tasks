package Task_18;
/*
Бинарные числа (8%)
Время: 1 сек.
Память: 16 Мб
Сложность: 8%

Говорят, что плохой программист – это тот, кто считает, что в одном килобайте 1000 байт, а хороший программист – это
тот, кто полагает, что в одном километре 1024 метра.

Многим эта шутка понятна, так как все знают, что в процессах, связанных с информатикой и компьютерной техникой,
фигурирует множество значений, выражаемых степенью двойки, то есть чисел вида 2K, где K – некоторое неотрицательное
целое число. Назовем такие числа бинарными. Это такие числа как 2, 4, 8, 16, 32 и т.д. Действительно, когда речь идет
о размере памяти или о разрешении экрана монитора, то мы часто наталкиваемся на бинарные числа. Все это связано с
принципом хранения информации в памяти ЭВМ.

Задано целое число N. Требуется определить, является ли оно бинарным.

Формат ввода
Входной файл input.txt содержит единственное целое число N, не превосходящее 10000 по абсолютной величине.

Формат вывода
В выходной файл output.txt выведите YES, если заданное число является бинарным, и NO в противном случае.

Примеры
Ввод	Вывод
1024	YES
23	    NO
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BinNumbers {
    public static void main(String[] args) {
        int input;
        String output = "YES";
        try (FileReader reader = new FileReader("task-18-input.txt")) {
            Scanner scanner = new Scanner(reader);
            input = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (input <= 0) {
            output = "NO";
        } else {
            while (input > 1)
                if (input % 2 == 0) {
                    input = input / 2;
                } else {
                    output = "NO";
                    break;
                }
        }

        try (FileWriter writer = new FileWriter("task-18-output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

