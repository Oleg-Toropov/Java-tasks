package Task_59;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Статистика (15%)
Время: 1 сек.
Память: 16 Мб
Сложность: 15%

Вася не любит английский язык, но каждый раз старается получить хотя бы четверку за четверть, чтобы оставаться
ударником. В текущей четверти Вася заметил следующую закономерность: по нечетным дням месяца он получал тройки,
а по четным – четверки. Так же он помнит, в какие дни он получал эти оценки. Поэтому он выписал на бумажке все
эти дни для того, чтобы оценить, сколько у него троек и сколько четверок. Помогите Васе это сделать, расположив
четные и нечетные числа в разных строчках. Вася может рассчитывать на оценку 4, если четверок не меньше, чем троек.

Формат ввода
В первой строке входного файла input.txt записано единственное число N – количество элементов целочисленного массива
(1 ≤ N ≤ 100). Вторая строка содержит N чисел, представляющих заданный массив. Каждый элемент массива – натуральное
число от 1 до 31. Все элементы массива разделены пробелом.

Формат вывода
В первую строку выходного файла output.txt нужно вывести числа, которые соответствуют дням месяцев, в которые Вася
получил тройки, а во второй строке соответственно расположить числа месяца, в которые Вася получил четверки.
В третьей строке нужно вывести «YES», если Вася может рассчитывать на четверку и «NO» в противном случае. В каждой
строчке числа следует выводить в том же порядке, в котором они идут во входных данных. При выводе, числа отделяются
пробелом.

Примеры
Ввод	                Вывод
5
4 16 19 31 2	        19 31
                        4 16 2
                        YES
8
29 4 7 12 15 17 24 1	29 7 15 17 1
                        4 12 24
                        NO

 */
public class Statistics {


    static public ArrayList<Integer> input() {
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void output(String st) {

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(st);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> listInput = input();
        StringBuilder three = new StringBuilder();
        StringBuilder four = new StringBuilder();

        for (Integer i : listInput) {

            if (i % 2 == 0) {
                four.append(i + " ");
            } else {
                three.append(i + " ");
            }
        }

        String result = (three.length() <= four.length()) ? "NO" : "YES";

        String output = three.toString() + "\n" + four.toString() + "\n" + result;
        output(output);
    }
}
