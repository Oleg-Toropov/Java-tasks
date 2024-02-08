package Task_99;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class NumberE {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            n = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BigDecimal e = new BigDecimal("2.7182818284590452353602875"); // Число е
        BigDecimal result = e.setScale(n, RoundingMode.HALF_UP);

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(result.toString());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
