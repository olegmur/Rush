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
        String n,c,s;
        InputStream inputStream=System.in;
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        n=read.readLine();
        c=read.readLine();
        s=read.readLine();
System.out.println(n +" "+ c +" "+ s + " = Чистая любовь, да-да!");

    }
}