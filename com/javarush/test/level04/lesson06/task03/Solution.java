package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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


        if (a>b)
            if (b>c) {System.out.println(a);System.out.println(b);System.out.println(c);}
            else
                if (a>c) {System.out.println(a);System.out.println(c);System.out.println(b);}
                else
                {System.out.println(c);System.out.println(a);System.out.println(b);}
        else
            if (a>c) {System.out.println(b);System.out.println(a);System.out.println(c);}
            else
                if (b>c) {System.out.println(b);System.out.println(c);System.out.println(a);}
                else {System.out.println(c);System.out.println(b);System.out.println(a);}

    }
}
