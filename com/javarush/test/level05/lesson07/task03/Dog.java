package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
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

    public void initialize(int name, int rost, int color)
    {
        this.name = name;
        this.rost = rost;
        this.color = color;
    }

    public void initialize(int name, int rost)
    {
        this.name = name;
        this.rost = rost;
    }

    public void initialize(int name)
    {
        this.name = name;
    }
}
