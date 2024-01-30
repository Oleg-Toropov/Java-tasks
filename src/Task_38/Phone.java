package Task_38;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Телефон (12%)
Время: 1 сек.
Память: 16 Мб
Сложность: 12%

Услуги телефонной сети оплачиваются по следующему правилу: за разговоры до А минут в месяц – В рублей за минуту, а
разговоры сверх установленной нормы оплачиваются из расчета С рублей за минуту. Требуется написать программу,
вычисляющую плату за пользование телефоном для разговоров продолжительностью Т минут в месяц.

Формат ввода
Входной файл input.txt содержит натуральные числа A, B, C и T, не превышающие 1000. Числа располагаются в одной строке
и разделены пробелами.

Формат вывода
В выходной файл output.txt выведите единственное целое число – месячную плату за пользование телефоном.

Примеры
Ввод	Вывод
30 2 3 30	60
20 1 3 30	50
 */
public class Phone {

    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (FileReader reader = new FileReader("task-38-input.txt")) {
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreElements()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String result = String.valueOf(listInput.get(0) * listInput.get(1)
                + (listInput.get(3) - listInput.get(0)) * listInput.get(2));

        try (FileWriter writer = new FileWriter("task-38-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
