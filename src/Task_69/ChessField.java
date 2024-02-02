package Task_69;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Шахматное поле (16%)
Время: 1 сек.
Память: 16 Мб
Сложность: 16%

На стандартной шахматной доске 8х8 заданы координаты двух клеток. Требуется определить: имеют ли данные клетки
одинаковый цвет?

Формат ввода
Входной файл input.txt содержит целые числа x1, y1, x2, y2, описывающие координаты двух клеток (x1,y1) и (x2,y2).
Ограничения: 1 ≤ x1,y1,x2,y2 ≤ 8.

Формат вывода
В выходной файл output.txt выведите YES, если поля одного цвета, или слово NO в противном случае.

Примеры
Ввод	Вывод
1 1 4 4	YES
1 2 7 5	NO
 */
public class ChessField {

    static String color(ArrayList<Integer> list) {
        ArrayList<String> color = new ArrayList<>();
        for (int i = 0; i < list.size(); i = i + 2) {
            if (list.get(i) % 2 == 0 && list.get(i + 1) % 2 == 0
                    || list.get(i) % 2 == 1 && list.get(i + 1) % 2 == 1) {
                color.add("black");
            } else {
                color.add("white");
            }
        }
        String result = (color.get(0).equals(color.get(1))) ? "YES" : "NO";
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String output = color(listInput);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
