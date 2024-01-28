package Task_17;
/*
Три толстяка (7%)
Время: 1 сек.
Память: 16 Мб
Сложность: 7%

Три толстяка решили поспорить: кто из них самый тяжелый. После взвешивания оказалось, что их масса соответственно M1,
M2 и M3 килограмм. Считается, что масса толстяка должна быть не менее 94 и не более 727 килограмм.

Помогите определить массу самого тяжелого из них, либо выяснить, что была допущена ошибка при взвешивании.

Формат ввода
Входной файл input.txt содержит три целых числа M1, M2 и M3, разделенные пробелом. Все числа целые и не превосходят
10 000 по абсолютной величине.

Формат вывода
В выходной файл output.txt выведите массу самого тяжелого толстяка в случае корректного взвешивания, либо слово «Error»
в противном случае.

Примеры
Ввод	Вывод
98 106 214	214
100 100 100	100
93 500 1000	Error
 */


import java.io.*;
import java.util.*;

public class ThreeFatMen {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String result;
        try (FileReader reader= new FileReader("task-17-input.txt")){
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

        Collections.sort(list);

        result = (list.get(0) < 94 || list.get(list.size()-1) >727)? "Error" : String.valueOf(list.get(list.size()-1));

        try (FileWriter writer = new FileWriter("task-17-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
