package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no dad
Cat name is бабушка Мурка, no mother, no dad
Cat name is папа Котофей, no mother, dad is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no dad
Cat name is сын Мурчик, mother is мама Василиса, dad is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, dad is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granddadName=reader.readLine();
        String grandMotherName=reader.readLine();
        String motherName=reader.readLine();
        String dadName=reader.readLine();
        String sonName=reader.readLine();
        String daughterName=reader.readLine();


        Cat grandMother = new Cat(grandMotherName);
        Cat granddad = new Cat(granddadName);
        Cat father = new Cat(granddad, dadName);
        Cat mother = new Cat(motherName, grandMother);
        Cat daughter = new Cat(daughterName, father, mother);
        Cat son = new Cat(sonName, father, mother);

        System.out.println(granddad);
        System.out.println(grandMother);
        //System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat
    {
        public String name;
        public Cat mom;
        public Cat dad;


        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat mom)
        {
            this.name = name;
            this.mom = mom;
        }

        Cat(Cat dad, String name)
        {
            this.name = name;
            this.dad = dad;
        }

        Cat(String name, Cat mom, Cat dad)
        {
            this.name = name;
            this.mom = mom;
            this.dad=dad;
        }

        @Override
       public String toString()
        {
            if (mom == null && dad == null)
                return "Cat name is " + name + ", no mother "+", no dad";
            else if (mom == null && dad !=null)
                return "Cat name is " + name + ", mother is " + mom.name + ", no dad";
            else if (dad == null && mom!=null)
                return "Cat name is " + name + ", no mother " + ", dad is " + dad.name;
            else
                return "Cat name is " + name + ", mother is " + mom.name + ", dad is " + dad.name;
        }
    }

}
