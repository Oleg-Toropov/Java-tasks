package Task_9;
/*
Два бандита (4%)
Время: 1 сек.
Память: 16 Мб
Сложность: 4%

Бандиты Гарри и Ларри отдыхали на природе. Решив пострелять, они выставили на бревно несколько банок из-под кока-колы
 (не больше 10). Гарри начал простреливать банки по порядку, начиная с самой левой, Ларри — с самой правой. В какой-то
 момент получилось так, что они одновременно прострелили одну и ту же последнюю банку.

Гарри возмутился и сказал, что Ларри должен ему кучу денег за то, что тот лишил его удовольствия прострелить несколько
банок. В ответ Ларри сказал, что Гарри должен ему еще больше денег по тем же причинам. Они стали спорить кто кому сколько
 должен, но никто из них не помнил сколько банок было в начале, а искать простреленные банки по всей округе было неохота.
  Каждый из них помнил только, сколько банок прострелил он сам.

Определите по этим данным, сколько банок не прострелил Гарри и сколько банок не прострелил Ларри.

Формат ввода
В единственной строке входного файла input.txt записано 2 числа — количество банок, простреленных Гарри и Ларри соответственно.

Формат вывода
В файл output.txt выведите 2 числа — количество банок, не простреленных Гарри и Ларри соответственно.

Пример 1
Ввод	Вывод
4 7	6 3
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bandits {
    public static void main(String[] args) {
        ArrayList<Integer> listInput = new ArrayList<>();

        try (FileReader reader = new FileReader("task-9-input.txt");
             FileWriter writer = new FileWriter("task-9-output.txt")) {

            Scanner scanner = new Scanner(reader);
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            while (st.hasMoreTokens()) {
                listInput.add(Integer.valueOf(st.nextToken()));
            }

            int allCansGarry = listInput.get(1) - 1;
            int allCansLarry = listInput.get(0) - 1;
            String result = String.valueOf(allCansGarry) + " " + String.valueOf(allCansLarry);

            writer.write(result);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }






    }


}
