package com.javarush.test.level04.lesson16.home02;

import java.util.Scanner;/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a<=b)&&(b<=c)) System.out.println(b);
        if ((a<=c)&&(c<=b)) System.out.println(c);

        if ((b<=a)&&(a<=c)) System.out.println(a);
        if ((b<=c)&&(c<=a)) System.out.println(c);

        if ((c<=b)&&(b<=a)) System.out.println(b);
        if ((c<=a)&&(a<=b)) System.out.println(a);
    }
}
