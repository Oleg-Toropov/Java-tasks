package Task_61;
/*
В одном шаге от счастья (16%)
Время: 1 сек.
Память: 16 Мб
Сложность: 16%

Вова купил билет в трамвае 13-го маршрута и сразу посчитал суммы первых трёх цифр и последних трёх цифр номера билета
(номер у билета шестизначный). Оказалось, что суммы отличаются ровно на единицу. «Я в одном шаге от счастья», — подумал
Вова, — «или предыдущий или следующий билет точно счастливый». Прав ли он?

Формат ввода
Входной файл input.txt содержит в первой строке число K – количество тестов. В следующих K строках записаны номера
билетов. Количество тестов не больше 10. Номер состоит ровно из шести цифр, среди которых могут быть и нули.
Гарантируется, что Вова умеет считать, то есть суммы первых трех цифр и последних трех цифр отличаются ровно на единицу.

Формат вывода
Выходной файл output.txt должен содержать K строк, в каждой из которых для соответствующего теста следует указать
"Yes", если Вова прав, и "No", если нет.

Примеры
Ввод	Вывод
3
715068  Yes
445219  No
012200	Yes
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OneStepFromHappiness {
    public static void main(String[] args) {
        ArrayList<String> listIn = new ArrayList<>();
        ArrayList<String> listOut = new ArrayList<>();
        String out;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listIn.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        listIn.remove(0);

        for (String s : listIn) {
            String last = String.valueOf(Integer.valueOf(s) - 1);
            String next = String.valueOf(Integer.valueOf(s) + 1);
            if(last.length() < 6) {
                last = (last.length() == 5)? "0" + last
                        : (last.length() == 4)? "00" + last
                        : (last.length() == 3)? "000" + last
                        : (last.length() == 2)? "0000" + last
                        : "00000";
            }
            if(next.length() < 6) {
                next = (next.length() == 5)? "0" + next
                        : (next.length() == 4)? "00" + next
                        : (next.length() == 3)? "000" + next
                        : (next.length() == 2)? "0000" + next
                        : "00000";
            }

            System.out.println(last +" "+ s +" "+ next);

            char[] chLast = last.toCharArray();
            char[] chNext = next.toCharArray();

            int l1 = 0;
            int l2 = 0;
            int n1 = 0;
            int n2 = 0;

            for (int i = 0; i < chLast.length; i++) {
                if (i < 3) {
                    l1 += chLast[i];
                    n1 += chNext[i];
                } else {
                    l2 += chLast[i];
                    n2 += chNext[i];
                }
            }
            listOut.add((l1 == l2 || n1 == n2) ? "Yes" : "No");
        }

        out = listOut.get(0) + "\n" + listOut.get(1) + "\n" + listOut.get(2);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
