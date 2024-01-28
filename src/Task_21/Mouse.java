package Task_21;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Мышка (9%)
Время: 1 сек.
Память: 16 Мб
Сложность: 9%

Однажды компьютерная мышка подумала, что стоит взять про запас еще один коврик. Чтобы никто не заметил запасного коврика,
мышка решила его спрятать под свой прямоугольный коврик. Пробравшись ночью на склад, мышка обнаружила там только круглые
коврики. Удастся ли мышке спрятать круглый коврик под прямоугольным ковриком?

Формат ввода
Входной файл input.txt содержит три натуральных числа: W, H и R, где W и H - ширина и высота прямоугольного коврика,
а R – радиус запасного коврика. Все числа не превосходят значения 109.

Формат вывода
В выходной файл output.txt выведите «YES», если новый коврик можно спрятать под старым, и слово «NO», если этого
сделать нельзя.

Примеры
Ввод	Вывод
4 7 2	YES
4 7 3	NO
 */
public class Mouse {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        try (FileReader reader = new FileReader("task-21-input.txt")){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                arrayList.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String result =
                (arrayList.get(2) *2 <= arrayList.get(0) && arrayList.get(2) *2 <= arrayList.get(1))? "YES" : "NO";


        try (FileWriter writer = new FileWriter("task-21-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
