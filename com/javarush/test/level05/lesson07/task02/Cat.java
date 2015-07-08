package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    protected String name;
    public int weight;
    protected int age;
    protected int color;
    protected int adress;



    public void initialize(String name)
    {
        this.name = name;
       // this
    }

    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 10;
    }

    public void initialize(int weight, int color)
    {
        //this.weight = name;
        this.color = color;
        this.weight = weight;
    }

    public void initialize(int weight, int color, int adress)
    {
        //this.weight = name;
        this.color = color;
        this.weight = weight;
    }

}
