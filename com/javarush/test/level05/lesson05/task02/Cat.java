package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(/*String nam, int a, int b, int c*/)
    {
       /* name = nam;
        age = a;
        weight = b;
        strength = c;*/

    }

    public boolean fight(Cat anotherCat)
    {
        //напишите тут ваш код
        return (this.strength > anotherCat.strength);
       /* if ((this.weight*this.strength*(1/Math.abs(this.age-5))-anotherCat.weight*anotherCat.strength*(1/Math.abs(anotherCat.age-5))) > 0)
            return true;
        else
            return false;*/

    }
    /*public static void main(String[] args)
    {
        Cat cat = new Cat ("Tom", 7,10,10);
        Cat cat2 = new Cat ("Kom", 6,11, 9);
        System.out.println(cat2.fight(cat)); // выдаст в консоль результат
    }*/

}


