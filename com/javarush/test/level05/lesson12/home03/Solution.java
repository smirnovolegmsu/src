package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. 
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Dog ScrafDog = new Dog("Scraf", 45 , 15);
        Cat TomCat = new Cat("Tom", 34 , 100);

        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        int strange;

        public Dog(String name, int height, int strange)
        {
            this.name = name;
            this.height = height;
            this.strange = strange;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int boring;

        public Cat(String name, int height, int boring)
        {
            this.name = name;
            this.height = height;
            this.boring = boring;
        }
    }

    //добавьте тут ваши классы

}
