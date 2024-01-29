package Task_37;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Счастливый билет (12%)
Время: 1 сек.
Память: 16 Мб
Сложность: 12%

Вы пользуетесь общественным транспортом? Вероятно, вы расплачивались за проезд и получали билет с номером. Счастливым
билетом называют такой билет с шестизначным номером, где сумма первых трех цифр равна сумме последних трех. Т.е. билет
с номером 385916 – счастливый, т.к. 3+8+5=9+1+6. Вам требуется написать программу, которая проверяет счастливость билета.

Формат ввода
В единственной строке входного файла input.txt записано одно целое число N (0 ≤ N < 106).

Формат вывода
В выходной файл output.txt нужно вывести «YES», если билет с номером N счастливый и «NO» в противном случае.

Примеры
Ввод	Вывод
385916	YES
123456	NO
 */
public class HappyTicket {
    public static void main(String[] args) {

        int firstSum = 0;
        int secondSum = 0;

        try (FileReader reader = new FileReader("task-37-input.txt");
             FileWriter writer = new FileWriter("task-37-output.txt")) {
            Scanner scanner = new Scanner(reader);
            String str1 = scanner.nextLine();
            char[] array = str1.toCharArray();
            int a = 0;

            /*
            str = sc.nextLine();
            char[] symbols = str.toCharArray();
            for (char symbol : symbols) {
            data.add(Character.getNumericValue(symbol));
            */

            while (a < array.length) {
                String str2 = String.valueOf(array[a]);
                if (a < 3) {
                    firstSum += Integer.valueOf(str2);
                } else {
                    secondSum += Integer.valueOf(str2);
                }
                a++;
            }
            String output = (firstSum == secondSum) ? "YES" : "NO";
            writer.write(output);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
