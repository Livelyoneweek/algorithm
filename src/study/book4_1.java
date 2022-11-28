package study;

import java.util.ArrayList;
import java.util.Scanner;

public class book4_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        int size = in.nextInt();
        int count = 0;

        while (in.hasNext()) {
            String next = in.next();
            if (next.equals("exit")) {
                break;
            }
            count +=1;
            str.add(next);
        }
        in.close();
        int x = 1;
        int y = 1;
        for (int i = 0; i < count; i++) {

            if (str.get(i).equals("L")) {
                if (x > 1) {
                    x -=1;
                }
            } else if (str.get(i).equals("R")) {
                if (x < size) {
                    x +=1;
                }
            }else if (str.get(i).equals("U")) {
                if (y > 1) {
                    y -=1;
                }
            }else if (str.get(i).equals("D")) {
                if (y < size) {
                    y +=1;
                }
            }
        }
        System.out.println(x + " " + y);
    }



}
