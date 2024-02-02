package Task_67;
/*
Поля (16%)
Время: 1 сек.
Память: 16 Мб
Сложность: 16%

Геннадий учится в сельской школе и мечтает стать агрономом. На уроке геометрии Геннадий познакомился с новой фигурой –
прямоугольником. Освоив вычисление площади прямоугольника, Гена подумал о том, что квадратные поля гораздо удобнее,
нежели прямоугольные. Поразмыслив еще немного, Гена столкнулся с интересной задачей: существует ли такое квадратное
поле, у которого площадь в точности равна площади заданного поля прямоугольной формы, чтобы при этом длины сторон
обеих полей были бы целыми числами?

Формат ввода
Входной файл input.txt содержит целые числа a и b – длины сторон прямоугольника (1 < = a*b ≤ 1014).

Формат вывода
В выходной файл output.txt выведите либо одно целое число c – длину стороны квадрата, либо 0, если квадрата с
целочисленной длиной стороны не существует.

Примеры
Ввод	Вывод
1 4	    2
2 8	    4
15 42	0
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Fields {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int a;
        double b;
        String result;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        a = list.get(0) * list.get(1);
        b = Math.sqrt(a);

        result = (a % b == 0) ? String.valueOf(Math.round(b)) : "0";

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
