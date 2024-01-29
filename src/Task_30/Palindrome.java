package Task_30;
/*
Четырехзначный палиндром (10%)
Время: 1 сек.
Память: 16 Мб
Сложность: 10%

Требуется написать программу, определяющую, является ли четырехзначное натуральное число N палиндромом, т.е. числом,
которое одинаково читается слева направо и справа налево.

Формат ввода
Входной файл input.txt содержит натуральное число N (1000 ≤ N ≤ 9999).

Формат вывода
В выходной файл output.txt следует вывести слово «YES», если число N является палиндромом, или «NO» – если нет.

Примеры
Ввод	Вывод
6116	YES
1231	NO
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listRevers = new ArrayList<>();
        try (FileReader reader = new FileReader("task-30-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            char[] ch = str.toCharArray();

            for (char c : ch) {
                list.add(String.valueOf(c));
            }

            for (int i = ch.length - 1; i >= 0; i--) {
                listRevers.add(String.valueOf(ch[i]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String output = (list.equals(listRevers)) ? "YES" : "NO";

        try (FileWriter writer = new FileWriter("task-30-output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
