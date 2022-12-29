package study.myReStudy;

import java.util.Scanner;

public class re3_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int minVa = 10001;
            for (int j = 0; j < m; j++) {
                int value = sc.nextInt();
                minVa = Math.min(minVa, value);
            }
            result = Math.max(result, minVa);
        }

        System.out.println(result);

    }
}
