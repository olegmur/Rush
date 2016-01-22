package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(is.readLine());
        if (n>7 || n<0)
        {
            System.out.println("такого дня недели не существует");
        }
        else
            if (n==1)
        {System.out.println("понедельник");}
            else
            if (n==2)
        {System.out.println("вторник");}
            else
            if (n==3)
            {System.out.println("среда");}
            else
            if (n==4)
            {System.out.println("четверг");}
            else
            if (n==5)
            {System.out.println("пятница");}
            else
            if (n==6)
            {System.out.println("суббота");}
            else
                        {System.out.println("воскресенье");}
    }

}