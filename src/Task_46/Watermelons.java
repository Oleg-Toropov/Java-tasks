package Task_46;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Арбузы (14%)
Время: 1 сек.
Память: 16 Мб
Сложность: 14%

Иван Васильевич пришел на рынок и решил купить два арбуза: один для себя, а другой для тещи. Понятно, что для себя нужно
выбрать арбуз потяжелей, а для тещи полегче. Но вот незадача: арбузов слишком много и он не знает как же выбрать самый
легкий и самый тяжелый арбуз? Помогите ему!

Формат ввода
В первой строке входного файла input.txt задано одно число N – количество арбузов. Вторая строка содержит N чисел,
записанных через пробел. Здесь каждое число – это масса соответствующего арбуза. Все числа натуральные и не превышают
30000.

Формат вывода
В выходной файл output.txt нужно вывести два числа через пробел: массу арбуза, который Иван Васильевич купит теще и
массу арбуза, который он купит себе.

Примеры
Ввод	Вывод
5
5 1 6 5 9	1 9
 */
public class Watermelons {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))){
            while (scanner.hasNextLine()) {
                list.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        list.remove(0);
        Collections.sort(list);
        String out = list.get(0) + " " + list.get(list.size()-1);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
