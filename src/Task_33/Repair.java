package Task_33;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Ремонт (11%)
Время: 1 сек.
Память: 16 Мб
Сложность: 11%

Ваш любимый дядя – директор фирмы, которая делает евроремонты в офисах. В связи с финансово-экономическим кризисом,
дядюшка решил оптимизировать свое предприятие.

Давно ходят слухи, что бригадир в дядюшкиной фирме покупает лишнее количество стройматериалов, а остатки использует для
отделки своей новой дачи. Ваш дядя заинтересовался, сколько в действительности банок краски необходимо для покраски
стен в офисе длиной L метров, шириной – W и высотой – H, если одной банки хватает на 16м2, а размерами дверей и окон
можно пренебречь? Заказов много, поэтому дядя попросил написать программу, которая будет все это считать.

Формат ввода
Входной файл input.txt содержит три натуральных числа L, W, H – длину, ширину и высоту офиса в метрах соответственно,
каждое из которых не превышает 1000.

Формат вывода
В выходной файл output.txt выведите одно целое число – минимальное количество банок краски, необходимых для покраски
стен в офисе.

Примеры
Ввод	Вывод
8 8 2	4
1 1 3	1
 */
public class Repair {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try (FileReader reader = new FileReader("task-33-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                list.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int aria = list.get(0) * list.get(2) * 2 + list.get(1) * list.get(2) * 2;
        String result = (aria < 16)?"1": String.valueOf(aria/16);
        if (aria%16 !=0) {
            result = String.valueOf(aria/16 + 1);
        }

        try (FileWriter writer = new FileWriter("task-33-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
