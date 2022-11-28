package study;

import java.util.Scanner;

public class book4_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s= in.next();
        in.close();

        String column = s.substring(0, 1);
        int col = changeCharToInt(column);
        int row = Integer.parseInt(s.substring(1));

        int calculatorCol = Math.min((col - 1), (8 - col));
        int calculatorRow = Math.min((row - 1), (8 - row));
        System.out.println(calculatorCol + " " + calculatorRow);

        int result = 8;

        if (Math.min(calculatorCol, calculatorRow) == 0) {
            if (Math.max(calculatorCol, calculatorRow) == 0) {
                result = 2;
            }else if (Math.max(calculatorCol, calculatorRow) == 1) {
                result = 3;
            }else if (Math.max(calculatorCol, calculatorRow) >= 2) {
                result = 4;
            }
        }else if (Math.min(calculatorCol, calculatorRow) == 1) {
            if (Math.max(calculatorCol, calculatorRow) == 1) {
                result = 4;
            }else if (Math.max(calculatorCol, calculatorRow) >= 2) {
                result = 6;
            }
        }
        System.out.println(result);
    }

    private static int changeCharToInt(String str) {
        int col = 0;
        switch (str) {
            case "a" : col = 1;
                 break;
            case "b" : col = 2;
                break;
            case "c" : col = 3;
                break;
            case "d" : col = 4;
                break;
            case "e" : col = 5;
                break;
            case "f" : col = 6;
                break;
            case "g" : col = 7;
                break;
            case "h" : col = 8;
                break;
        }
        return col;
    }

}
