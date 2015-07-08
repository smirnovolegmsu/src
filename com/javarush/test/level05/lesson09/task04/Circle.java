package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    protected int centerX;
    protected int centerY;
    protected int radius;
    protected int width;
    protected int color;

    public Circle(int centerX, int centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, int color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
