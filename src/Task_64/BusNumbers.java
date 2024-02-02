package Task_64;
/*
Номера автобусов (16%)
Время: 1 сек.
Память: 16 Мб
Сложность: 16%

Однажды Вася очень долго просидел на остановке, прежде чем дождался своего автобуса. Чтобы как-то занять время, он
решил записывать на листочке государственные регистрационные номера проходящих мимо автобусов, следующих по другому
маршруту, нежели нужен был Васе. При этом производилась запись лишь основного номера, без учета региональной
принадлежности. В итоге Васе удалось записать N таких номеров.

Основная часть государственного регистрационного номера состоит из 6 символов: трех букв и трех цифр. Сначала идет
буква, затем 3 цифры и еще 2 буквы заканчивают запись. В качестве цифр могут использоваться любые цифры от 0 до 9,
а в качестве букв только прописные буквы, обозначения которых присутствуют как в английском, так и в русском алфавите,
т.е. только следующие символы: A, B, C, E, H, K, M, O, P, T, X, Y. Например, «P204BT» - правильный номер, а «X182YZ»
и «ABC216» - нет.

Ваша задача заключается в проверке правильности проделанной Васей работы. А именно, нужно определить, какие из номеров
соответствуют принятому стандарту, а какие нет.

Формат ввода
Первая строка входного файла input.txt содержит единственное натуральное число N – количество записанных Васей номеров
(N ≤ 50). Далее следует N строк с записями номеров автобусов. Длины строк от 1 до 300 и содержат только символы с
кодами ASCII от 33 до 127 (не содержат пробелов, специальных и русских символов).

Формат вывода
В выходной файл output.txt выведите N строк, в i-й строке должно содержаться «Yes», если соответствующая i-я запись
номера верна и «No» в противном случае.

Примеры
Ввод	    Вывод
5
P204BT      Yes
X182YZ      No
a216bc      No
A216BC      Yes
ABC216	    No
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BusNumbers {
    public static void main(String[] args) {
        ArrayList<String> listInput = new ArrayList<>();
        ArrayList<String> listResult = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while (scanner.hasNextLine()) {
                listInput.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        listInput.remove(0);

        for (String s : listInput) {
            if (Pattern.matches("[A-C|E|H|K|M|O|P|T|X|Y][0-9][0-9][0-9]" +
                    "[A-C|E|H|K|M|O|P|T|X|Y][A-C|E|H|K|M|O|P|T|X|Y]", s)) {
                listResult.add("Yes");
            } else {
                listResult.add("No");
            }
        }

        for (String s : listResult) {
            output.append(s + "\n");
        }
        System.out.println(output);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(output.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
