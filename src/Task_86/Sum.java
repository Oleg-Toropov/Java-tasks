package Task_86;

import java.io.PrintWriter;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Write number N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        PrintWriter pr = new PrintWriter(System.out);
        pr.print(sum);
        pr.flush();
    }
}
