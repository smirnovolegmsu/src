package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a>b)
            if (a>c)
                if (a>d) System.out.print(a);
                else System.out.print(d);
            else
                if (c>d) System.out.print(c);
                else System.out.print(d);
        else
            if (b>c)
                if (b>d) System.out.print(b);
                else System.out.print(d);
            else
                if (c>d) System.out.print(c);
                else System.out.print(d);
            /*System.out.print(a);
        else System.out.print(b);*/


    }
}
