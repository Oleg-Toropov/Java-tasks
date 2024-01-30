package Task_42;
/*
День программиста (13%)
Время: 1 сек.
Память: 16 Мб
Сложность: 13%

День программиста отмечается в 255-й день года (при этом 1 января считается нулевым днем). Требуется написать программу,
которая определит дату (месяц и число григорианского календаря), на которую приходится День программиста в заданном году.

В григорианском календаре високосным является:

год, номер которого делится нацело на 400
год, номер которого делится на 4, но не делится на 100
Формат ввода
В единственной строке входного файла input.txt записано целое число от 1 до 9999 включительно, которое обозначает номер
года нашей эры.

Формат вывода
В единственную строку выходного файла OUTPUT.TXT нужно вывести дату Дня программиста в формате DD/MM/YYYY, где
DD — число, MM — номер месяца (01 — январь, 02 — февраль, ..., 12 — декабрь), YYYY — год в десятичной записи.

Примеры
Ввод	Вывод
2000	12/09/2000
2009	13/09/2009
 */


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ProgrammersDay {
    public static void main(String[] args) {
        int year;
        int month = 1;
        int day = 1;

        try (FileReader reader = new FileReader("task-42-input.txt")) {
            Scanner scanner = new Scanner(reader);
            year = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LocalDate date = LocalDate.of(year, month, day);
        date = date.plusDays(255);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String output = date.format(f);

        try (FileWriter writer = new FileWriter("task-42-output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
