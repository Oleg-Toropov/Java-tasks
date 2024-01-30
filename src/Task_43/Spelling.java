package Task_43;
/*
Орфография (13%)
Время: 1 сек.
Память: 16 Мб
Сложность: 13%

У студента-филолога Васи есть замечательный друг Петя. И Петя никак не может выучить английский язык. Английский текст
Петя еще кое-как читает, но пишет с ужасными ошибками, причем чаще всего он вставляет в слова лишние буквы.

Вася решил помочь Пете. Теперь каждый день Вася диктует Пете слова, а Петя их записывает. После семестра занятий Петя
стал писать много лучше и теперь делает в словах только по одной ошибке. Чтобы автоматизировать процесс исправления
ошибок, Вася просит Вас написать программу, которая удаляет из слова одну лишнюю букву и показывает Пете правильное слово.

Формат ввода
Входной файл input.txt содержит целое число K - номер лишней буквы, а затем через один или несколько пробелов записано
слово S, состоящее из английских букв верхнего регистра. Гарантируется, что номер буквы не превышает длину слова. Длина
слова не более 80 символов.

Формат вывода
В выходной файл output.txt выведите исправленное слово.

Примеры
Ввод	Вывод
4 MISTSPELL	MISSPELL
2 ABC	AC
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Spelling {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder word;
        try (FileReader reader = new FileReader("task-43-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                list.add(st.nextToken());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (list.size() > 1) {
            word = new StringBuilder(list.get(1));
            word.deleteCharAt(Integer.valueOf(list.get(0)) - 1);
        } else {
            word = new StringBuilder("Write a word");
        }

        try (FileWriter writer = new FileWriter("task-43-output.txt")) {
            writer.write(word.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
