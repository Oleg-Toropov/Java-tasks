package Task_27;
/*
Прямоугольный параллелепипед (10%)
Время: 1 сек.
Память: 16 Мб
Сложность: 10%

Прямоугольный параллелепипед - это объемная фигура, у которой шесть граней, и каждая из них является прямоугольником.
Моделями прямоугольного параллелепипеда служат классная комната, кирпич, спичечная коробка. Длины трех ребер
прямоугольного параллелепипеда, имеющих общий конец, называют его измерениями. На приведенном рисунке измерения
представлены ребрами AB, BC и BF с общим концом в точке B, а значения измерений равны их длинам a, b и c соответственно.

По заданным измерениям прямоугольного параллелепипеда Вам необходимо определить площадь его поверхности и объем.

Формат ввода
Единственная строка входного файла input.txt содержит разделенные пробелом три натуральных числа A, B и С – измерения
параллелепипеда, каждое из измерений не превышает 106.

Формат вывода
В выходной файл output.txt выведите через пробел два целых числа: площадь поверхности и объем заданного параллелепипеда.

Примеры
Ввод	Вывод
1 1 1	6 1
2 3 4	52 24
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Parallelepiped {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();



        try (FileReader reader = new FileReader("task-27-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int a = listInput.get(0);
        int b = listInput.get(1);
        int c = listInput.get(2);

        int s = 2*(a*b+a*c+b*c);
        int v = a*b*c;

        String output = s + " " + v;

        try (FileWriter writer = new FileWriter("task-27-output.txt")){
           writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
