package Task_5;
/*
Больше-меньше (3%)
Время: 1 сек.
Память: 16 Мб
Сложность: 3%

Одна из основных операций с числами – их сравнение. Мы подозреваем, что вы в совершенстве владеете этой операцией
и можете сравнивать любые числа, в том числе и целые. В данной задаче необходимо сравнить два целых числа.

Формат ввода
В двух строчках входного файла input.txt записаны числа A и B, не превосходящие по абсолютной величине 2×109.

Формат вывода
Запишите в выходной файл output.txt один символ "<", если A < B, ">", если A > B и "=", если A=B.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("task-5-input.txt"));
             FileWriter writer = new FileWriter("task-5-output.txt")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String result = (a < b) ? "<" : (a > b) ? ">" : "=";
            writer.write(result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
