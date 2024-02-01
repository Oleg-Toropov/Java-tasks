package Task_53;
/*
Клетки (15%)
Время: 1 сек.
Память: 16 Мб
Сложность: 15%

Известно, что шахматная доска имеет размерность 8х8 и состоит из клеток 2х цветов, например, черного и белого
(см. рисунок). Каждая клетка имеет координату, состоящую из буквы и цифры. Горизонтальное расположение клетки
определяется буквой от A до H, а вертикальное – цифрой от 1 до 8. Заметим, что клетка с координатой А1 имеет
черный цвет. Требуется по заданной координате определить цвет клетки.

Формат ввода
В единственной строке входного файла input.txt записана координата клетки на шахматной доске: всего два символа –
буква и цифра (без пробелов).

Формат вывода
В выходной файл output.txt нужно вывести «WHITE», если указанная клетка имеет белый цвет и «BLACK», если она черная.

Примеры
Ввод	Вывод
C3	BLACK
G8	WHITE
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cell {
    public static void main(String[] args) {
        String input;
        String result = "WHITE";

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] ch = input.toCharArray();

        if (ch[0] == 'A' || ch[0] == 'C' || ch[0] == 'E' || ch[0] == 'G') {
            if (Integer.valueOf(ch[1]) % 2 != 0) {
                result = "BLACK";
            }
        } else if (ch[0] == 'B' || ch[0] == 'D' || ch[0] == 'F' || ch[0] == 'H') {
            if (Integer.valueOf(ch[1]) % 2 == 0) {
                result = "BLACK";
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
