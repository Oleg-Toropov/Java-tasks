package Task_65;
/*
Метро (16%)
Время: 1 сек.
Память: 16 Мб
Сложность: 16%

Витя работает недалеко от одной из станций кольцевой линии метро, а живет рядом с другой станцией той же линии.
Требуется выяснить, мимо какого наименьшего количества промежуточных станций необходимо проехать Вите по кольцу,
чтобы добраться с работы домой.

Формат ввода
Во входном файле input.txt заданы три числа: сначала N – общее количество станций кольцевой линии, а затем i и j –
номера станции, на которой Витя садится, и станции, на которой он должен выйти. Станции пронумерованы подряд
натуральными числами 1, 2, 3, …, N (1-я станция – соседняя с N-й), N не превосходит 100. Числа i и j не совпадают.
Все числа разделены пробелом.

Формат вывода
В выходной файл output.txt требуется вывести минимальное количество промежуточных станций (не считая станции посадки
и высадки), которые необходимо проехать Вите.

Примеры
Ввод	    Вывод
100 5 6	    0
10 1 9	    1
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Subway {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> listInput = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader("input.txt"));
        while (scanner.hasNextInt()) {
            listInput.add(scanner.nextInt());
        }
        int a = Math.abs(listInput.get(2) - listInput.get(1))  - 1;
        int b = (listInput.get(2) > listInput.get(1)) ? listInput.get(0) - listInput.get(2) + listInput.get(1) - 1
                : listInput.get(0) - listInput.get(1) + listInput.get(2) - 1;
        int result = (a < b) ? a : b;

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
