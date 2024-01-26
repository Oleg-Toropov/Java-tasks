package Task_12;
/*
Арифметика (5%)
Время: 1 сек.
Память: 16 Мб
Сложность: 5%

Вася изучает таблицу умножения чисел от 1 до 100 в десятичной системе счисления, а поскольку запомнить такую таблицу
очень сложно, то Васе придется очень долго ее зубрить. Составьте для Васи программу, которая поможет ему проверять
свои знания.

Формат ввода
Во входном файле input.txt записаны три натуральных числа A, B и C через пробел. Числа A и B ≤ 102, а C ≤ 106.

Формат вывода
В выходной файл нужно вывести YES в том случае, если A*B=C и вывести NO в противном случае.

Пример 1
Ввод	    Вывод
8 54 432	YES
8 54 432	NO
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Arithmetic {

    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (FileReader reader = new FileReader("task-12-input.txt")){
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String result = (listInput.get(0)*listInput.get(1) == listInput.get(2))? "YES" : "NO";

        try (FileWriter writer = new FileWriter("task-12-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
