package com.javarush.test.level04.lesson13.task02;

import java.util.Scanner;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k=n;
        for (;m>0;m--)
        {
            for(;n >0;n--)
            {
                System.out.print(8);
            }
            if (m!=1) System.out.println();
            n=k;
        }

    }
}
