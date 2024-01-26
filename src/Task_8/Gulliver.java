package Task_8;
/*
Гулливер (4%)
Время: 1 сек.
Память: 16 Мб
Сложность: 4%

Из книги Джонатана Свифта мы знаем, что тот Гулливер посетил страну «Лилипутию», где живут лилипуты, окруженные вещами,
 животными и заводами небольшого размера. Сначала лилипуты боялись Гулливера, но позже они поняли, что такое соседство
 приносит им большую выгоду, и они стали помогать ему. Например, лилипуты делали кровать для Гулливера из своих маленьких
 матрацев, сшитых вместе. Лилипутам были известны размеры Гулливера. Довольно быстро они смогли просчитать количество
 матрацев, необходимых для шитья большого матраца. Но у них постоянно возникали сложности с их небольшим ростом и стеля
 постель, они иногда не могли сшить достаточно толстый матрац.

Формат ввода
Входной файл input.txt содержит два целых числа, которые разделены пробелом: K – коэффициент, отражающий во сколько раз
 Гулливер больше лилипутов, и M – количество слоев матрацев (2 ≤ K, M ≤ 100).

Формат вывода
В выходной файл output.txt выведите количество матрацев лилипутов, необходимых для построения матраца для Гулливера.

Пример 1
Ввод	Вывод
2 2	    8
12 4	576
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Gulliver {

    public static void main(String[] args) {
        ArrayList <Integer> listSize = new ArrayList<>();
        int size;

        try(FileReader reader = new FileReader("task-8-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listSize.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        size = listSize.get(0)*listSize.get(0)*listSize.get(1);

        try (FileWriter writer = new FileWriter("task-8-output.txt")){
            writer.write(String.valueOf(size));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
