package Task_44;
/*
Строки в книге (13%)
Время: 1 сек.
Память: 16 Мб
Сложность: 13%

В книге на одной странице помещается K строк. Таким образом, на 1-й странице печатаются строки с 1-й по K-ю, на второй
— с (K+1)-й по (2∙K)-ю и т.д. Напишите программу, которая по номеру строки в тексте определяет номер страницы, на
которой будет напечатана эта строка, и порядковый номер этой строки на странице.

Формат ввода
Входной файл input.txt содержит число K – количество строк, которое печатается на странице, и число N – номер строки
(1 ≤ K ≤ 200, 1 ≤ N ≤ 20000).

Формат вывода
В выходной файл output.txt выведите два числа – номер страницы, на которой будет напечатана эта строка и номер строки
на странице.

Примеры
Ввод	Вывод
50 1	1 1
20 25	2 5
15 43	3 13
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LinesInBook {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int allLineOnPage;
        int lineSearch;
        int numberPage;
        int numberLine;

        try (FileReader reader = new FileReader("task-44-input.txt")) {
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

        allLineOnPage = list.get(0);
        lineSearch = list.get(1);

        if (lineSearch % allLineOnPage != 0) {
            numberPage = lineSearch / allLineOnPage + 1;
            numberLine = lineSearch % allLineOnPage;

        } else {
            numberPage = lineSearch / allLineOnPage;
            numberLine = lineSearch / numberPage;
        }

        String output = String.valueOf(numberPage) + " " + String.valueOf(numberLine);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(output);
    }
}
