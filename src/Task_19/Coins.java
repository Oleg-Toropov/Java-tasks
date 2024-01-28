package Task_19;
/*
Монетки (8%)
Время: 1 сек.
Память: 16 Мб
Сложность: 8%

На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом. Определите минимальное число
монеток, которые нужно перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной.

Формат ввода
В первой строке входного файла input.txt записано натуральное число N (1 ≤ N ≤ 100) – число монеток. В каждой из
последующих N строк содержится одно целое число – 1 если монетка лежит решкой вверх и 0 если вверх гербом.

Формат вывода
В выходной файл output.txt выведите минимальное количество монет, которые нужно перевернуть.

Примеры
Ввод	Вывод
5
1
0
1
1
0	2
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        int countTails = 0;
        int countHeads = 0;

        try (FileReader reader = new FileReader("task-19-input.txt")){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()){
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i<listInput.size();i++){
            countTails += listInput.get(i);
        }

        countHeads = listInput.get(0) - countTails;

        String result = (countTails == countHeads || countTails < countHeads)? String.valueOf(countTails)
                : String.valueOf(countHeads);

        try (FileWriter writer = new FileWriter("task-19-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
