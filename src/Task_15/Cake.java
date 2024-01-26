package Task_15;
/*
Торт (6%)
Время: 1 сек.
Память: 16 Мб
Сложность: 6%

На свой день рождения Петя купил красивый и вкусный торт, который имел идеально круглую форму. Петя не знал, сколько
гостей придет на его день рождения, поэтому вынужден был разработать алгоритм, согласно которому он сможет быстро
разрезать торт на N равных частей. Следует учесть, что разрезы торта можно производить как по радиусу, так и по диаметру.

Помогите Пете решить эту задачу, определив наименьшее число разрезов торта по заданному числу гостей.

Формат ввода
Входной файл input.txt содержит натуральное число N – число гостей, включая самого виновника торжества (N ≤ 1000).

Формат вывода
В выходной файл output.txt выведите минимально возможное число разрезов торта.

Примеры
Ввод	Вывод
2	    1
3	    3
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        int input;
        String countCuts;

        try (FileReader reader = new FileReader("task-15-input.txt")) {
            Scanner scanner = new Scanner(reader);
            input = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        countCuts = (input % 2 == 0 && input > 1) ? String.valueOf(input / 2)
                : (input % 2 == 1 && input > 1) ? String.valueOf(input) : "0";

        try (FileWriter writer = new FileWriter("task-15-output.txt")) {
            writer.write(countCuts);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
