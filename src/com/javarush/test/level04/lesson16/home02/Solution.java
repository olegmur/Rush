package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        //String m = is.readLine();
        // String n = is.readLine();
        int k=0;
        int n1 = Integer.parseInt(is.readLine());
        while (n1!=-1)
        {k+=n1;
            n1 = Integer.parseInt(is.readLine());
        }
        k=k-1;

        //int n2 = Integer.parseInt(is.readLine());
        // int n3 = Integer.parseInt(is.readLine());
        System.out.println(k);//напишите тут ваш код
    }
}
