package by.it.drachenko.lesson02;

import java.util.Scanner;
import java.util.SortedMap;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Ввод:");
        int a=cs.nextInt();
        int b=cs.nextInt();
        int c=a+b;
        System.out.println("Вывод:");
        System.out.println("Sum"+" "+"="+" "+c);
    }
}
