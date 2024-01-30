package Task_40;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Цветочки (12%)
Время: 1 сек.
Память: 16 Мб
Сложность: 12%

В рождественский вечер на окошке стояло три цветочка, слева направо: герань, крокус и фиалка. Каждое утро Маша вытирала
окошко и меняла местами стоящий справа цветок с центральным цветком. А Таня каждый вечер поливала цветочки и меняла
местами левый и центральный цветок. Требуется определить порядок цветов ночью по прошествии K дней.

Формат ввода
Во входном файле input.txt содержится натуральное число K – число дней (K ≤ 1000).

Формат вывода
В выходной файл OUTPUT.TXT требуется вывести три английских буквы: «G», «C» и «V» (заглавные буквы без пробелов),
описывающие порядок цветов на окошке по истечении K дней (слева направо). Обозначения: G – герань, C – крокус, V – фиалка.

Примеры
Ввод	Вывод
1	VGC
5	CVG
 */
public class Flowers {

    public static void main(String[] args) {
        ArrayDeque<String> order = new ArrayDeque<>(Arrays.asList("G", "C", "V"));
        StringBuilder result = new StringBuilder();
        int a;

        try (FileReader reader = new FileReader("task-40-input.txt")) {
            Scanner scanner = new Scanner(reader);
            a = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (a > 0) {
            order.addFirst(order.getLast());
            order.removeLast();
            a--;
        }

        for (String s : order) {
            result.append(s);
        }

        try (FileWriter writer = new FileWriter("task-40-output.txt")) {
            writer.write(result.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
