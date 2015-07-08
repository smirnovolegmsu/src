package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man Oleg = new Man("Oleg", 21, "Mytishi"),Anton = new Man("Anton", 21, "Moscow");
        Woman Olga = new Woman("Olga", 23, "Mytishi"),Anna = new Woman("Anna", 23, "Moscow");
        //выведи их на экран тут
        Oleg.out1();
        Anton.out1();
        Olga.out1();
        Anna.out1();
    }

    public static class Man 
    {
        String name;
        int age;
        String address;

        public void out1() {
            System.out.println(name + " " + age + " " + address);
        }

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;
            this.address = "бомж";
        }

        public Man(String name, String address)
        {
            this.name = name;
            this.age = 18;
            this.address = address;
        }

        public Man(int age, String address)
        {
            this.name = "Дурак";
            this.age = age;
            this.address = address;
        }

        public Man(Man another1)
        {
            this.name = another1.name;
            this.age = another1.age;
            this.address = another1.address;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public void out1() {
            System.out.println(name + " " + age + " " + address);
        }

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
            this.address = "бомж";
        }

        public Woman(String name, String address)
        {
            this.name = name;
            this.age = 18;
            this.address = address;
        }

        public Woman(int age, String address)
        {
            this.name = "Дурак";
            this.age = age;
            this.address = address;
        }

        public Woman(Woman another1)
        {
            this.name = another1.name;
            this.age = another1.age;
            this.address = another1.address;
        }
    }

    //добавьте тут ваши классы
}
