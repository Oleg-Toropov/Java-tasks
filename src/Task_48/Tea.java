package Task_48;
/*
Кипячение чая (14%)
Время: 1 сек.
Память: 16 Мб
Сложность: 14%

В эту субботу у Васи день рождения и через 15 минут к нему придут гости. Ему срочно надо вскипятить чай, для того чтобы
напоить им гостей. У Васи дома есть много литровых чайников (можно считать, что их бесконечное количество), а розетка
всего одна. Т.к. вода кипятится очень долго, за 15 минут она успеет вскипятиться максимум один раз. Но Вася – мальчик
не промах, он достал из кладовки N тройников, в i-том тройнике ai разъемов. Теперь Вася ломает голову: как ему соединить
тройники и воткнуть эту систему в розетку, чтобы максимизировать количество чайников, которые он сможет поставить
кипятить.

Ваша задача заключается в написании программы, которая определит максимальное число чайников, которые возможно
использовать для кипячения чая, используя данные тройники.

Формат ввода
В первой строке входного файла input.txt содержится число N (1 ≤ N ≤ 105) – количество тройников. Во второй строке через
пробел перечислены числа ai (1 ≤ ai ≤ 1000, 1 ≤ i ≤ N) – информация о тройниках.

Формат вывода
В выходной файл output.txt выведите ответ на задачу.

Примеры
Ввод	Вывод
1
1	    1
3
2 5 4	9
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tea {
    public static void main(String[] args) {
        ArrayList<Integer> listIn = new ArrayList<>();
        int sum = 0;
        int result;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listIn.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i < listIn.size(); i++) {
            sum += listIn.get(i);
        }

        result = sum - (listIn.get(0) - 1);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
