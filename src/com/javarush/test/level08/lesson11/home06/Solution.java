package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human ch1 = new Human("сын1", true, 15, new ArrayList<Human>());
        Human ch2 = new Human("сын2", true, 15, new ArrayList<Human>());
        Human ch3 = new Human("сын3", true, 15, new ArrayList<Human>());
        ArrayList<Human> child = new ArrayList<Human>();
        child.add(ch1);
        child.add(ch2);
        child.add(ch3);
        Human f = new Human("Папа", true, 45, child);
        Human m = new Human("Мама", false, 45, child);

        ArrayList<Human> child2 = new ArrayList<Human>();
        child.add(f);

        ArrayList<Human> child3 = new ArrayList<Human>();
        child.add(m);
        Human gf1 = new Human("Дед1", true, 85, child2);
        Human gm1 = new Human("Баба1", true, 85, child2);
        Human gf2 = new Human("Дед2", true, 85, child3);
        Human gm2 = new Human("Баба2", true, 85, child3);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(f);
        System.out.println(m);
        System.out.println(gf1);
        System.out.println(gm1);
        System.out.println(gf2);
        System.out.println(gm2);

    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;


       public Human (String name, Boolean sex, int age, ArrayList<Human> children)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
