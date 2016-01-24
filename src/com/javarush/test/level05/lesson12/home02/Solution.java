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
       Man m1=new Man(); //создай по два объекта каждого класса тут
        Man m2=new Man();
        Woman w2=new Woman();
        Woman w1=new Woman();


        System.out.println(m1.name+" " + m1.age+ " " +m1.address);
        System.out.println(m2.name+ " " +m2.age+ " " +m2.address);
        System.out.println(w1.name+" " + w1.age+" " +w1.address);
        System.out.println(w2.name+" " +w2.age+" " +w2.address);
    }

    public static class Man
    {
        String name, address;
        int age;

        public Man()
        {        }

        public Man(String name,String address)
    {
        this.name=name;
        this.address=address;
    }

        public Man(int age,String name)
        {
            this.name=name;
            this.age=age;
        }

        public Man(String address,int age)
        {
            this.age=age;
            this.address=address;
        }

        public Man(int age, String address, String name)
        {
            this.name=name;
            this.address=address;
            this.age=age;
        }
        public Man(String address, int age, String name)
        {
            this.name=name;
            this.address=address;
            this.age=age;
        }

        public Man(String address, String name, int age)
        {
            this.name=name;
            this.address=address;
            this.age=age;
        }
        

    }

    public static class Woman
    {
        String name, address;
       int age;

        public Woman()
        {

        }

        public Woman(String name,String address)
        {
            this.name=name;
            this.address=address;
        }

        public Woman(int age,String name)
        {
            this.name=name;
            this.age=age;
        }

        public Woman(String address,int age)
        {
            this.age=age;
            this.address=address;
        }

        public Woman(int age, String address, String name)
        {
            this.name=name;
            this.address=address;
            this.age=age;
        }

        public Woman(String address, int age, String name)
        {
            this.name=name;
            this.address=address;
            this.age=age;
        }

        public Woman(String address, String name, int age)
        {
            this.name=name;
            this.address=address;
            this.age=age;
        }



    }



}
