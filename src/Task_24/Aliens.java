package Task_24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Внеземные гости (10%)
Время: 1 сек.
Память: 16 Мб
Сложность: 10%

Недавно на поле фермера Джона были обнаружены следы приземления летающих тарелок. Об этом даже писала газета
Mew Yorc Courier.

Поле фермера Джона имеет форму круга радиусом r1. По сообщениям журналистов были обнаружены два следа от летающих
тарелок, имевшие форму кругов. Один из них имел радиус r2, второй - радиус r3. Также сообщается, что они находились
внутри поля фермера Джона и не пересекались, ни один из них не лежал внутри другого. При этом, они, возможно, касались
друг друга и/или границы поля.

Поскольку журналисты часто склонны преувеличивать масштабы событий, необходимо написать программу, которая будет
проверять, могли ли иметь место события, описанные в газете.

Формат ввода
Входной файл input.txt содержит три целых положительных числа - r1, r2, r3 (1 ≤ r1, r2, r3 ≤ 109).

Формат вывода
В выходной файл output.txt выведите слово YES, если информация, опубликованная в газете, может соответствовать правде,
и слово NO - иначе.

Примеры
Ввод	    Вывод
10 10 10	NO
10 3 4	    YES
 */
public class Aliens {
    public static void main(String[] args) {
        List <Integer> listInput = new ArrayList<>();

        try (FileReader reader = new FileReader("task-24-input.txt")){
            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String output = (listInput.get(0) >= listInput.get(1) + listInput.get(2)) ? "YES" : "NO";

        try (FileWriter writer = new FileWriter("task-24-output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
