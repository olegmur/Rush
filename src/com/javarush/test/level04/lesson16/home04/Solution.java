package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        String m = is.readLine();
       // String n = is.readLine();
        int n1 = Integer.parseInt(is.readLine());
        int n2 = Integer.parseInt(is.readLine());
        int n3 = Integer.parseInt(is.readLine());
        System.out.println("Меня зовут " + m);
        System.out.println("Я родился " + n3+"."+ n2+"."+n1);

    }
}
