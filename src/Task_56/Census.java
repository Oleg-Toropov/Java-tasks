package Task_56;
/*
Перепись (15%)
Время: 1 сек.
Память: 16 Мб
Сложность: 15%

В доме живет N жильцов. Однажды решили провести перепись всех жильцов данного дома и составили список, в котором
указали возраст и пол каждого жильца. Требуется найти номер самого старшего жителя мужского пола.

Формат ввода
Во входном файле input.txt в первой строке задано натуральное число N – количество жильцов (N ≤ 100). В последующих
N строках располагается информация о всех жильцах: каждая строка содержит два целых числа: V и S – возраст и пол
человека (1 ≤ V ≤ 100, S – 0 или 1). Мужскому полу соответствует значение S=1, а женскому – S=0.

Формат вывода
Выходной файл output.txt должен содержать номер самого старшего мужчины в списке. Если таких жильцов несколько, то
следует вывести наименьший номер. Если жильцов мужского пола нет, то выведите -1.

Примеры
Ввод	Вывод
4
25 1
70 1
100 0
3 1	    2

2
25 0
25 1	2
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Census {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int oldest = 0;
        int number = 0;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(list);

        for (int i = 1; i < list.size(); i = i + 2) {
            if (oldest < list.get(i) && list.get(i + 1) == 1) {
                oldest = list.get(i);
            }
        }

        if (oldest != 0) {
            for (int i = 1; i < list.size(); i = i + 2) {
                number++;
                if (list.get(i) == oldest && list.get(i + 1) == 1) {
                    break;
                }
            }
        } else {
            number = -1;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(number));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
