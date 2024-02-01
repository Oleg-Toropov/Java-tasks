package Task_60;
/*
Цапли (15%)
Время: 1 сек.
Память: 16 Мб
Сложность: 15%

Петя и Маша пришли в зоопарк. Больше всего Пете понравились цапли. Он был поражен их способностью спать на одной ноге.
В вольере находятся несколько цапель. Некоторые из них стоят на двух ногах, некоторые — на одной. Когда цапля стоит на
одной ноге, то другую ее ногу не видно. Петя пересчитал видимые ноги всех цапель, и у него получилось число a. Через
несколько минут к вольеру подошла Маша. За это время некоторые цапли могли поменять позу, поэтому Петя предложил ей
заново пересчитать видимые ноги цапель. Когда Маша это сделала, у нее получилось число b. Выйдя из зоопарка, Петя с
Машей заинтересовались, сколько же всего цапель было в вольере. Вскоре ребята поняли, что однозначно определить это
число можно не всегда. Теперь они хотят понять, какое минимальное и какое максимальное количество цапель могло быть
в вольере.

Требуется написать программу, которая по заданным числам a и b выведет минимальное и максимальное количество цапель,
которое могло быть в вольере.

Формат ввода
Входной файл input.txt содержит два целых числа a и b, разделенных ровно одним пробелом (1 ≤ a ≤ 109, 1 ≤ b ≤ 109).

Формат вывода
В выходной файл output.txt выведите два целых числа, разделенных пробелом — минимальное и максимальное число цапель,
которое могло быть в вольере. Гарантируется, что хотя бы одно количество цапель соответствует условию задачи.

Примеры
Ввод	Вывод
3 4	    2 3
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Herons {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int min;
        int max;
        Scanner scanner = new Scanner(new FileReader("input.txt"));
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);
        min = list.get(0) / 2 + list.get(0) % 2;
        max = list.get(0);

        String result = String.valueOf(min) + " " + String.valueOf(max);
        FileWriter writer = new FileWriter("output.txt");
        writer.write(result);
        writer.close();
    }
}