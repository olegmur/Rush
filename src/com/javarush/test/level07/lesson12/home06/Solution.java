package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human gf1 = new Human("Дед1", true, 65);
        Human mf1 = new Human("Баба1", false, 62);
        Human gf2 = new Human("Дед2", true, 67);
        Human mf2 = new Human("Баба2", false, 63);
        Human f = new Human("ПАпа", true, 32, gf1, mf1);
        Human m = new Human("Мама", false, 33, gf2, mf2);
        Human c1 = new Human("Сын", true, 12, f, m);
        Human c2 = new Human("Дочь1", false, 13, f, m);
        Human c3 = new Human("Дочь2", false, 14, f, m);

        System.out.println(gf1);
        System.out.println(mf1);
        System.out.println(gf2);
        System.out.println(mf2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name,Boolean sex,int age)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;

        }

        public Human(String name,Boolean sex,int age, Human father, Human mother)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
