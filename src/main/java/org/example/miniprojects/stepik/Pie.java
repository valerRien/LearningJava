package org.example.miniprojects.stepik;

import java.util.Scanner;

public class Pie {

    public static int findNok() {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        input.close();

        return nok(firstNumber, secondNumber);
    }

    //нахождение НОД в рекурсии, пока остаток не будет нуль
    private static int nod(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return nod(b, a % b);
        }
    }

    //нахождение НОК через НОД
    private static int nok(int a, int b) {
        return (a * b) / nod(a, b);
    }
}
