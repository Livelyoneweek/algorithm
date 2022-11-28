package study;

import java.util.Scanner;

public class book4_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int count = 0;

        for(int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i, j, k)) {
                        count +=1;
                    }
                }
            }
        }
    }

    private static boolean check(int h, int m, int s) {
        if (h%10 == 3 || m/10 == 3 || m%10 == 3 || s/10 == 3 || s%10 == 3) {
            return true;
        }
        return false;
    }
}
