package Task_20;
/*
Пятью пять - двадцать пять! (8%)
Время: 1 сек.
Память: 16 Мб
Сложность: 8%

Вася и Петя учатся в школе в одном классе. Недавно Петя поведал Васе о хитром способе возведения в квадрат натуральных
чисел, оканчивающихся на цифру 5. Теперь Вася может с легкостью возводить в квадрат двузначные (и даже некоторые
трехзначные) числа, оканчивающиеся на 5. Способ заключается в следующем: для возведения в квадрат числа, оканчивающегося
на 5 достаточно умножить число, полученное из исходного вычеркиванием последней пятерки на следующее по порядку число,
затем остается лишь приписать «25» к получившемуся результату справа. Например, для того, чтобы возвести число 125 в
квадрат достаточно 12 умножить на 13 и приписать 25, т.е. приписывая к числу 12*13=156 число 25, получаем результат 15625,
т.е. 1252=15625. Напишите программу, возводящую число, оканчивающееся на 5, в квадрат для того, чтобы Вася смог
проверить свои навыки.

Формат ввода
В единственной строке входного файла input.txt записано одно натуральное число А, оканчивающееся на цифру 5, не
превышающее 4*105.

Формат вывода
В выходной файл output.txt выведите одно натуральное число - A2 без лидирующих нулей.

Примеры
Ввод	Вывод
5	    25
75	    5625
4255	18105025
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        String strInput;
        String strOutput;

        try (FileReader reader = new FileReader("task-20-input.txt")) {
            Scanner scanner = new Scanner(reader);
            strInput = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        strInput = strInput.strip();
        if (strInput.length() == 1 && strInput.equals("5")) {
            strOutput = "25";
        } else if (strInput.endsWith("5")) {
            strInput = strInput.substring(0, strInput.length() - 1);
            int a = Integer.valueOf(strInput) * (Integer.valueOf(strInput) +1);
            strOutput = String.valueOf(a) + 25;

        } else {
            strOutput = "Write correct figure";
        }

        try (FileWriter writer = new FileWriter("task-20-output.txt")){
            writer.write(strOutput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
