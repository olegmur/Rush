package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
String n1 = read.readLine();
for (int i =1; i<2; i++)
       if (n1.equals("привет"))
        System.out.println(i + ". Привет Женя и Олег");
        else
           if (n1.equals("пока"))
        System.out.println(i + ". Пока Женя и Олег");
        else
           if (n1.equals("как дела?"))
        System.out.println("хорошо");
        else
               System.out.println(i + ". Не пиши ерунду!!!");
    }
}