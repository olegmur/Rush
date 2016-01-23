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
        Man man1;
        man1=new Man("Boris", 35, "Ghjfd");
        Man man2= new Man("Boris2", 34, "dkfsl");
        Woman woman1= new Woman("neBoris", 15, "lgnso");
        Woman woman2= new Woman("neBoris32", 18, "ivmd");
        System.out.println(man1.name + " " + man1.age  + " " + man1.adress);
        System.out.println(man2.name + " " + man2.age  + " " + man2.adress);
        System.out.println(woman1.name + " " + woman1.age  + " " + woman1.adress);
        System.out.println(woman2.name + " " + woman2.age  + " " + woman2.adress);
    }

    public static class Man
    {
        String name, adress;
        int age;
        public Man()
        {

        }

        public Man(String name)
        {
            this.name=name;
        }

        public Man(String name, int age)
        {
            this.name=name;
            this.age=age;
        }
        public Man(String name, String adress)
        {
            this.name=name;
            this.adress=adress;
        }

        public Man(int age, String adress)
        {
            this.age=age;
            this.adress=adress;
        }

        public Man(String name, int age, String adress)
        {
            this.name=name;
            this.age=age;
            this.adress=adress;
        }


    }
    public static class Woman
    {
        String name, adress;
        int age;
        public Woman()
        {

        }
        public Woman(String name)
        {
            this.name=name;
        }

        public Woman(String name, int age)
        {
            this.name=name;
            this.age=age;
        }
        public Woman(String name, String adress)
        {
            this.name=name;
            this.adress=adress;
        }

        public Woman(int age, String adress)
        {
            this.age=age;
            this.adress=adress;
        }

        public Woman(String name, int age, String adress)
        {
            this.name=name;
            this.age=age;
            this.adress=adress;
        }


    }



}
