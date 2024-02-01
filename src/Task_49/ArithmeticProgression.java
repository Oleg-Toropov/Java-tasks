package Task_49;
/*
Арифметическая прогрессия (15%)
Время: 1 сек.
Память: 16 Мб
Сложность: 15%

Заданы первый и второй элементы арифметической прогрессии. Требуется написать программу, которая вычислит элемент
прогрессии по ее номеру.

Формат ввода
Входной файл input.txt содержит три целых числа, разделенных пробелами – первый элемент прогрессии A1 (1 ≤ A1 ≤ 1000),
второй элемент прогрессии A2 (1 ≤ A2 ≤ 1000), и номер требуемого элемента N (1 ≤ N ≤ 1000).

Формат вывода
Выходной файл output.txt должен содержать одно целое число - N-й элемент арифметической прогрессии.

Примеры
Ввод	Вывод
1 5 3	9
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        ArrayList<Integer> listIn = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))){
            while (scanner.hasNextLine()) {
                listIn.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int step = listIn.get(1) - listIn.get(0);
        int result = (listIn.get(2) - 2) * step + listIn.get(1);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
