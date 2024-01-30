package Task_45;
/*
Автобусная экскурсия (14%)
Время: 1 сек.
Память: 16 Мб
Сложность: 14%

Оргкомитет Московской городской олимпиады решил организовать обзорную экскурсию по Москве для участников олимпиады.
Для этого был заказан двухэтажный автобус (участников олимпиады достаточно много и в обычный они не умещаются) высотой
437 сантиметров. На экскурсионном маршруте встречаются N мостов. Жюри и оргкомитет олимпиады очень обеспокоены тем, что
высокий двухэтажный автобус может не проехать под одним из них. Им удалось выяснить точную высоту каждого из мостов.
Автобус может проехать под мостом тогда и только тогда, когда высота моста превосходит высоту автобуса.

Помогите организаторам узнать, закончится ли экскурсия благополучно, а если нет, то установить, где произойдет авария.

Формат ввода
Во входном файле input.txt сначала содержится число N (1 ≤ N ≤ 1000). Далее идут N натуральных чисел, не превосходящих
10000 - высоты мостов в сантиметрах в том порядке, в котором они встречаются на пути автобуса.

Формат вывода
В единственную строку выходного файла output.txt нужно вывести фразу "No crash", если экскурсия закончится благополучно.
Если же произойдет авария, то нужно вывести сообщение "Crash k", где k - номер моста, где произойдет авария. Фразы
выводить без кавычек ровно с одним пробелом внутри.

Примеры
Ввод	    Вывод
1
763	        No crash
3
763 245 113	Crash 2
1
437	        Crash 1
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class BusTour {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIn = new ArrayList<>();
        String result = null;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {

            while (scanner.hasNextInt()){
                arrayListIn.add( scanner.nextInt());
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        for (int i = 1; i<arrayListIn.size(); i++) {
            if(arrayListIn.get(i)<=437) {
                result = "Crash" + " " + String.valueOf(i);
                break;
            } else {
                result = "No crash";
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
