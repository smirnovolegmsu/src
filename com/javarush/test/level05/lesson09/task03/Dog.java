package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    protected int name;
    protected int rost;
    protected int color;

    public Dog(int name, int rost, int color)
    {
        this.name = name;
        this.rost = rost;
        this.color = color;
    }

    public Dog(int name, int rost)
    {
        this.name = name;
        this.rost = rost;
    }

    public Dog(int name)
    {
        this.name = name;
    }
}
