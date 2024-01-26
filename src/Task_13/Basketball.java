package Task_13;
/*
Баскетбол (5%)
Время: 1 сек.
Память: 16 Мб
Сложность: 5%

Известны результаты каждой из 4х четвертей баскетбольной встречи. Нужно определить победителя матча. Побеждает команда,
набравшая больше очков в течение всего матча.

Формат ввода
Входной файл input.txt содержит 4 строки, в каждой строке находится два целых числа a и b – итоговый счет в
соответствующей четверти. а – количество набранных очков за четверть первой командой, b – количество очков, набранных
за четверть второй командой. (0 ≤ a,b ≤ 100).

Формат вывода
В выходной файл output.txt выведите номер выигравшей команды, в случае ничьей следует вывести «DRAW».

Пример 1
Ввод	Вывод
26 17
13 15
19 11
14 16	1

14 15
17 18
20 20
15 17	2

15 16
18 17
10 12
14 12	DRAW
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Basketball {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        ArrayList<Integer> team_A = new ArrayList<>();
        ArrayList<Integer> team_B = new ArrayList<>();
        int a = 0;
        int b = 0;
        String result;

        try (FileReader reader = new FileReader("task-13-input.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()) {
                listInput.add(scanner.nextInt());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < listInput.size(); i++) {
            if (i % 2 == 0) {
                team_A.add(listInput.get(i));
            } else {
                team_B.add(listInput.get(i));
            }
        }

        for (Integer s : team_A) {
            a += s;
        }
        for (Integer s : team_B) {
            b += s;
        }

        result = (a>b)? "1" : (a<b)? "2" : "DRAW";

        try (FileWriter writer = new FileWriter("task-13-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
