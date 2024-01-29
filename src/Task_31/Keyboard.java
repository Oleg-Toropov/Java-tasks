package Task_31;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Клавиатура (11%)
Время: 1 сек.
Память: 16 Мб
Сложность: 11%

Для данной буквы английского алфавита нужно вывести справа стоящую букву на стандартной клавиатуре. При этом клавиатура
замкнута, т.е. справа от буквы «p» стоит буква «a», от буквы «l» стоит буква «z», а от буквы «m» — буква «q».

Формат ввода
Первая строка входного файла input.txt содержит один символ — маленькую букву английского алфавита.

Формат вывода
В выходной файл output.txt следует вывести букву стоящую справа от заданной буквы, с учетом замкнутости клавиатуры.

Примеры
Ввод	Вывод
q	w
t	y
m	q
 */
public class Keyboard {
    public static void main(String[] args) {
        String keyboard = "qwertyuiopasdfghjklzxcvbnm";
        String letter;
        String output = "Write a correct letter";

        try (FileReader reader = new FileReader("task-31-input.txt")) {
            Scanner scanner = new Scanner(reader);
            letter = scanner.next();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        char[] charsKeyboard = keyboard.toCharArray();

        for (int i = 0; i < charsKeyboard.length - 1; i++) {
            if (letter.charAt(0) == charsKeyboard[i]) {
                output = String.valueOf(charsKeyboard[i + 1]);
            } else if (letter.charAt(0) == charsKeyboard[charsKeyboard.length-1]) {
                output = String.valueOf(charsKeyboard[0]);
            }
        }

        try (FileWriter writer = new FileWriter("task-31-output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
