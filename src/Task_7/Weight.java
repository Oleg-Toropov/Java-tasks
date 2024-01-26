package Task_7;
/*
Эния (3%)
Время: 1 сек.
Память: 16 Мб
Сложность: 3%

Неспокойно сейчас на стапелях шестого дока межгалактического порта планеты Торна. Всего через месяц закончится
реконструкция малого броненесущего корвета “Эния”. И снова этому боевому кораблю и его доблестной команде предстоят
тяжелые бои за контроль над плутониевыми рудниками Сибелиуса. Работа не прекращается ни на секунду, лазерные сварочные
аппараты работают круглые сутки. От непрерывной работы плавятся шарниры роботов-ремонтников. Но задержаться нельзя ни
на секунду.

И вот в этой суматохе обнаруживается, что термозащитные панели корвета вновь требуют срочной обработки сульфидом тория.
Известно, что на обработку одного квадратного метра панели требуется 1 нанограмм сульфида. Всего необходимо обработать
N прямоугольных панелей размером A на B метров. Вам необходимо как можно скорее подсчитать, сколько всего сульфида
необходимо на обработку всех панелей “Энии”. И не забудьте, что панели требуют обработки с обеих сторон.

Формат ввода
Во входном файле input.txt содержатся 3 целых положительных числа N (N ≤ 100), A (A ≤ 100), B (B ≤ 100).

Формат вывода
В выходной файл output.txt нужно вывести единственное число – вес необходимого для обработки сульфида тория в нанограммах.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();
        try (FileReader reader = new FileReader("task-7-input.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()) {
                listInput.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String result = String.valueOf(listInput.get(0) * listInput.get(1) * listInput.get(2) * 2);

        try (FileWriter writer = new FileWriter("task-7-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
