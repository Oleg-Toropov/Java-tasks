package Task_26;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Золотой песок (10%)
Время: 1 сек.
Память: 16 Мб
Сложность: 10%

Сотрудники завода по производству золотого песка из воздуха решили поправить свое финансовое положение. Они пробрались
на склад завода, где хранился золотой песок трех видов. Один килограмм золотого песка первого вида они смогли бы продать
за A1 рублей, второго вида – за A2 рублей, а третьего вида – за A3 рублей. Так получилось, что у сотрудников оказалось с
собой только три емкости: первая была рассчитана на B1 килограмм груза, вторая на B2 килограмм, а третья на B3 килограмм.
Им надо было заполнить полностью все емкости таким образом, чтобы получить как можно больше денег за весь песок. При
заполнении емкостей нельзя смешивать песок разных видов, то есть, в одну емкость помещать более одного вида песка, и
заполнять емкости песком так, чтобы один вид песка находился более чем в одной емкости.

Требуется написать программу, которая определяет, за какую сумму предприимчивые сотрудники смогут продать весь песок в
случае наилучшего для себя заполнения емкостей песком.

Формат ввода
В единственной строке входного файла input.txt записано 6 натуральных чисел A1, A2, A3, B1, B2, B3, записанных в одной
строке через пробел. Все числа не превосходят 100.

Формат вывода
В единственную строку выходного файла output.txt нужно вывести единственное целое число – сумму в рублях, которую смогут
сотрудники заработать в случае наилучшего для себя заполнения емкостей песком.

Примеры
Ввод	        Вывод
1 2 3 3 2 1	    14
 */
public class GoldSand {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> listCost = new ArrayList<>();
        ArrayList<Integer> listSize = new ArrayList<>();
        int price = 0;

        FileReader reader = new FileReader("task-26-input.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextInt()) {
            if (listCost.size() < 3) {
                listCost.add(scanner.nextInt());
            } else {
                listSize.add(scanner.nextInt());
            }
        }

        Collections.sort(listCost);
        Collections.sort(listSize);

        for (int i = 0; i < listCost.size(); i++) {
            price += listCost.get(i) * listSize.get(i);
        }

        FileWriter writer = new FileWriter("task-26-output.txt");
        writer.write(String.valueOf(price));
        System.out.println(price);
        writer.close();
    }
}
