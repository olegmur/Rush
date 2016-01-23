package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    protected String name, color, adr;
    protected int weight, age;

    public Cat(String name)
    {
        this.name=name;
        this.age=1;
        this.weight=3;
    }
    public Cat(String name, int weight, int age)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public Cat(String name, int age)
    {
        this.name=name;
        this.age=age;
        this.weight=3;
    }


    public Cat(int weight, String color)
    {
        this.color=color;
        this.age=6;
        this.weight=weight;
    }

    public Cat(int weight, String color, String adr)
    {
        this.color=color;
        this.age=6;
        this.weight=weight;
        this.adr=adr;
    }

}
