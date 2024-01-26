package Task_14;
/*
Сбор земляники (6%)
Время: 1 сек.
Память: 16 Мб
Сложность: 6%

Маша и Миша собирали землянику. Маше удалось сорвать X ягод, а Мише – Y ягод. Поскольку ягода была очень вкусной, то
ребята могли какую то часть ягод съесть. По нашим подсчетам вместе они съели Z ягод.

Требуется определить: сколько ягод ребята собрали в результате, при этом следует проверить, не ошиблись ли мы в
расчетах, подсчитывая количество съеденных ягод (их не должно было получиться больше, чем сорванных ягод).

Формат ввода
Входной файл input.txt содержит три натуральных числа X, Y и Z, не превышающих 1000. Все числа расположены в первой
строке файла и разделены пробелом.

Формат вывода
В выходной файл output.txt выведите количество собранных ягод, если наши подсчеты оказались правдоподобными, либо слово
«Impossible» в противном случае.

Примеры
Ввод	Вывод
3 2 1	4
12 13 5	20
2 5 9	Impossible
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StrawberryPicking {

    public static void main(String[] args) {
        ArrayList <Integer> listInput = new ArrayList<>();
        String str;
        int result;

        try (FileReader reader = new FileReader("task-14-input.txt")){
            Scanner scanner = new Scanner(reader);
            str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        result = listInput.get(0)+listInput.get(1)-listInput.get(2);
        String picking =  (result >= 0)? String.valueOf(result) : "Impossible";

        try (FileWriter writer = new FileWriter("task-14-output.txt")){
            writer.write(picking);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
