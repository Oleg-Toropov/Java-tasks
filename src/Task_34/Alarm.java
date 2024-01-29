package Task_34;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Будильник (12%)
Время: 1 сек.
Память: 16 Мб
Сложность: 12%

Известный исследователь Чарльз Ф. Мантц, устав от долгого путешествия через джунгли, лег спать в 10 часов вечера,
но предварительно он завел будильник на 12 часов следующего дня. Но проспать 14 часов ему не удалось – будильник
зазвонил через 2 часа. Исследователь забыл, что на будильнике, имеющем 12-тичасовой циферблат, можно задать время
до звонка только менее 12 часов.

Напишите программу, которая определяет, сколько часов успеет проспать исследователь, прежде чем будильник его разбудит.

Формат ввода
В единственной строке входного файла input.txt записаны два целых числа S и T (1 ≤ S, T ≤ 12; S ≠ T), разделенные одним
пробелом - час, когда исследователь лег спать, и час, на который он установил будильник.

Формат вывода
В единственную строку выходного файла output.txt нужно вывести одно целое число – через сколько часов зазвонит будильник.

Примеры
Ввод	Вывод
10 12	2
 */
public class Alarm {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int result;
        FileReader reader = new FileReader("task-34-input.txt");
        Scanner scanner = new Scanner(reader);
        String str = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        if (list.get(0) < list.get(1)) {
            result = list.get(1) - list.get(0);
        } else {
            result = 12 - list.get(0) + list.get(1);
        }

        FileWriter writer = new FileWriter("task-34-output.txt");
        writer.write(String.valueOf(result));
        writer.close();
    }
}
