package Task_42;

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
