package ru.kev.multiplication;

import java.util.Scanner;


/**
 * Класс , который принимает произведение двух заданных целых чисел без использования операции умножения.
 *
 * @author Karnauhov E.V.
 */
public class Multiplication {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите первое число для умножения:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число для умножения");
        int b = scanner.nextInt();

        long beforeTime = System.currentTimeMillis();

        if (a < 0 && b < 0){
            a = -a;
            b = -b;
        }

        if(a > 0 && b < 0){
            a = -a;
            b = -b;
        }
            System.out.println("Результат: " + result(a,b));
            long time = System.currentTimeMillis() - beforeTime;
            System.out.println("Время: " + time + " ms.");
        }

    /**
     * Метод, в котором происходит умножения без оператора умножения.
     *
     * @param a первое число
     * @param b второе число
     * @return результат вычислений
     */

    private static int result(int a, int b) {

        int result=0;

        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}