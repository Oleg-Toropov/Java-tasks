package Task_32;
/*
Конечные автоматы (11%)
Время: 1 сек.
Память: 16 Мб
Сложность: 11%

Однажды известный профессор обнаружил описания k конечных автоматов. По его мнению, нетривиальность конечного автомата,
имеющего n состояний и m переходов, можно описать целым числом d = 19m + (n + 239)*(n + 366) / 2 . Чем больше d, тем
больший интерес для науки представляет изучение его свойств.

Помогите профессору вычислить нетривиальность имеющихся у него автоматов.

Формат ввода
Первая строка входного файла input.txt содержит целое число k (1 ≤ k ≤ 10000) – количество конечных автоматов.
Следующие k строк содержат по два целых числа ni (0 ≤ ni ≤ 1000) и mi (0 ≤ mi ≤ 26ni2) – число состояний и переходов
i-го автомата.

Формат вывода
Выходной файл output.txt должен состоять из k строк. На i-й строке выходного файла выведите одно число – нетривиальность
i-го автомата.

Примеры
Ввод	        Вывод
4               44344
2 0             48134
13 20           45699
5 23            49458
18 6

2               48767
15 20           1340237
1000 26000
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class StateMachines {

    public static void main(String[] args) {
        int d, n, m;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listResult = new ArrayList<>();

        try (FileReader reader = new FileReader("task-32-input.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i < list.size(); i = i + 2) {
            n = list.get(i);
            m = list.get(i + 1);
            d = 19 * m + (n + 239) * (n + 366) / 2;
            listResult.add(d);
        }

        try (FileWriter writer = new FileWriter("task-32-output.txt")) {
            for (int i : listResult) {
                writer.write(i +"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
