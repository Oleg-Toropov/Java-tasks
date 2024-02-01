package Task_50;
/*
Время прибытия (15%)
Время: 1 сек.
Память: 16 Мб
Сложность: 15%

Задано время отправления поезда и время в пути до конечной станции. Требуется написать программу, которая найдет время
прибытия этого поезда (возможно, в другие сутки).

Формат ввода
Входной файл input.txt содержит две строки. В первой строке задано время отправления, а во второй строке – время в пути.
Время отправления задается в формате «HH:MM», где HH время в часах, которое принимает значение от 00 до 23, ММ – время в
минутах, которое принимает значение от 00 до 59. Время в пути задается двумя неотрицательными целыми числами – количество
часов и количество минут. Числа разделяются одним пробелом. Количество часов не превышает 120, минут – 59.

Формат вывода
Выходной файл output.txt должен содержать одну строку – время прибытия поезда на конечную станцию. Формат вывода этого
времени совпадает с форматом ввода времени отправления.

Примеры
Ввод	Вывод
00:00
10 10	10:10

01:02
4 6	    05:08

11:00
22 0	09:00
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TimeArrive {
    public static void main(String[] args) {
        ArrayList<String> listInput1 = new ArrayList<>();
        ArrayList<Integer> listInput2 = new ArrayList<>();
        LocalTime timeArrive;
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput1.add(scanner.nextLine());
            }
            StringTokenizer st1 = new StringTokenizer(listInput1.get(0), ":");
            StringTokenizer st2 = new StringTokenizer(listInput1.get(1), " ");
            while (st1.hasMoreTokens()) {
                listInput2.add(Integer.valueOf(st1.nextToken()));
            }
            while (st2.hasMoreTokens()) {
                listInput2.add(Integer.valueOf(st2.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        timeArrive = LocalTime.of(listInput2.get(0), listInput2.get(1))
                .plusHours(listInput2.get(2))
                .plusMinutes(listInput2.get(3));

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(timeArrive.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
