package Task_94;

import java.util.Scanner;

public class TimeKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = n;

        while (i > 0) {
            sum += i % 2;
            i = i / 2;
        }

        int result = n + sum;
        System.out.println(result);
    }
}
