package Task_55;
/*
НОД (15%)
Время: 1 сек.
Память: 16 Мб
Сложность: 15%

Даны два натуральных числа A и B. Требуется найти их наибольший общий делитель (НОД).

Формат ввода
Во входном файле input.txt в единственной строке записаны натуральные числа A и B через пробел (A, B ≤ 109).

Формат вывода
В выходной файл output.txt выведите НОД чисел А и В.

Примеры
Ввод	Вывод
12 42	6
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        String result = "Not common divider";
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(list);

        for (int i = list.get(0) - 1; i > 0; i--) {
            if (list.get(0) % i == 0 && list.get(1) % i == 0) {
                result = String.valueOf(i);
                break;
            }
        }
        System.out.println(result);
    }
}
