package Task_54;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Напёрстки (15%)
Время: 1 сек.
Память: 16 Мб
Сложность: 15%

Шулер показывает следующий трюк. Он имеет три одинаковых наперстка. Под первый (левый) он кладет маленький шарик.
Затем он очень быстро выполняет ряд перемещений наперстков, каждое из которых – это одно из трех перемещений - A, B, C:

A - обменять местами левый и центральный наперстки,
B - обменять местами правый и центральный наперстки,
C - обменять местами левый и правый наперстки.
Необходимо определить, под каким из наперстков окажется шарик после всех перемещений.

Формат ввода
В единственной строке входного файла input.txt записана строка длиной от 1 до 50 символов из множества {A, B, C} –
последовательность перемещений.

Формат вывода
В единственную строку выходного файла output.txt нужно вывести номер наперстка, под которым окажется шарик после
перемещений.

Примеры
Ввод	    Вывод
CBABCACCC	1
 */
public class Thimbles {
    public static void main(String[] args) {
        String input;
        int position = 1;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] ch = input.toCharArray();

        int i = 0;
        while (i < ch.length) {
            if (ch[i] == 'A' && position == 1) {
                position = 2;
            } else if (ch[i] == 'A' && position == 2) {
                position = 1;
            } else if (ch[i] == 'B' && position == 2) {
                position = 3;
            } else if (ch[i] == 'B' && position == 3) {
                position = 2;
            } else if (ch[i] == 'C' && position == 1) {
                position = 3;
            } else if (ch[i] == 'C' && position == 3) {
                position = 1;
            }
            i++;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(position));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
