package Task_1;
/*
Время: 1 сек.
Память: 16 Мб
Сложность: 1%
Возможно, что Вы когда то играли в игру «Глухой телефон», либо слышали о ней. В этой игре участникам приходится передавать информацию друг другу различными способами: словесно, образно, бывает даже приходится писать левой рукой текст, который другой участник команды должен будет прочитать. Так же известно, что практически никогда передаваемая информация не доходит до конечного адресата. Обозначим за Fi(x) функцию, которая преобразует текст передаваемой информации x в ту, которую получит участник i+1 от участника i. Тогда последний n-й участник получит данные y, которые будут выражаться следующей формулой:
y = Fn-1(Fn-2(…F2(F1(x))))
Но Вам необходимо исключить какие-либо внешние факторы, которые могут исказить исходную информацию и Вы должны реализовать программу «неглухой телефон», которая сможет безошибочно доставлять исходные данные, т.е. в нашем случае функция Fi(x) = x для всех i от 1 до n-1.

Формат ввода
В единственной строке входного файла input.txt записано натуральное число от 1 до 100.
Формат вывода
В выходной файл output.txt нужно вывести в точности то же число, которое задано во входном файле.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotDeafPhone {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new FileReader("task-1-input.txt"));
             FileWriter write = new FileWriter("task-1-output.txt")) {
            String readInput = sc.next();
            write.write(readInput);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}