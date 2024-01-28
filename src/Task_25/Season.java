package Task_25;

import java.io.*;
import java.util.Scanner;

/*
Время года (10%)
Время: 1 сек.
Память: 16 Мб
Сложность: 10%

По заданному номеру месяца в году требуется определить время года.

Формат ввода
Входной файл input.txt содержит натуральное число N (N≤100) – номер месяца.

Формат вывода
В выходной файл output.txt выведите для летних месяцев значение «Summer», для зимних – «Winter», для весенних –
«Spring», для осенних – «Autumn». Если число не соответствует возможному значению месяца, то в этом случае следует
вывести «Error».

Примеры
Ввод	Вывод
3	Spring
15	Error
 */
public class Season {

    public static void main(String[] args) {
        int month;
        String output;
        try (FileReader reader = new FileReader("task-25-input.txt")) {
            Scanner scanner = new Scanner(reader);
            month = Integer.valueOf(scanner.nextLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

            switch (month) {
                case 12:
                case 1:
                case 2:
                    output = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    output = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    output = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    output = "Autumn";
                    break;
                default:
                    output = "Error";
            }

        try (FileWriter writer = new FileWriter("task-25-output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
