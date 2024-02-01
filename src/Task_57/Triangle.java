package Task_57;
/*
Площадь треугольника (15%)
Время: 1 сек.
Память: 16 Мб
Сложность: 15%

По целочисленным координатам вершин треугольника (x1,y1), (x2,y2) и (x3,y3) требуется вычислить его площадь.

Формат ввода
Входной файл input.txt содержит 6 целых чисел x1,y1,x2,y2,x3,y3 – координаты вершин треугольника. Все числа не
превышают 106 по абсолютной величине.

Формат вывода
В выходной файл output.txt выведите точное значение площади заданного треугольника.

Примеры
Ввод	        Вывод
2 1 2 4 6 1	    6
0 0 0 3 3 0	    4.5
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {

    ArrayList<Integer> coordinates;
    ArrayList<Double> sides;
    double area;

    Triangle side(Triangle t) {
        double ab = Math.sqrt(Math.pow(coordinates.get(0) - coordinates.get(2), 2)
                + Math.pow(coordinates.get(1) - coordinates.get(3), 2));
        double bc = Math.sqrt(Math.pow(coordinates.get(2) - coordinates.get(4), 2)
                + Math.pow(coordinates.get(3) - coordinates.get(5), 2));
        double ac = Math.sqrt(Math.pow(coordinates.get(0) - coordinates.get(4), 2)
                + Math.pow(coordinates.get(1) - coordinates.get(5), 2));
        sides.add(ab);
        sides.add(bc);
        sides.add(ac);
        return t;
    }

    Triangle area(Triangle t) {
        double p = (t.sides.get(0) + t.sides.get(1) + t.sides.get(2)) / 2;
        t.area = Math.sqrt(p * (p - t.sides.get(0)) * (p - t.sides.get(1)) * (p - t.sides.get(2)));
        return t;
    }


    public static void main(String[] args) {
        Triangle tr = new Triangle();
        tr.coordinates = new ArrayList<>();
        tr.sides = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                tr.coordinates.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        tr.side(tr);
        tr.area(tr);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        String output = decimalFormat.format(tr.area);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
