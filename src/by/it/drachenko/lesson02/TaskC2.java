package by.it.drachenko.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        int b=cs.nextInt();
        int c=a+b;
        for (int i = 0; i <4; i++) {
            System.out.println("DEC:"+" "+a+"+"+b+"="+c);
        }
    }

}
