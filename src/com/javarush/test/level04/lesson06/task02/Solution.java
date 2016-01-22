package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

import static java.lang.Math.max;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(is.readLine());
        int n2 = Integer.parseInt(is.readLine());
        int n3 = Integer.parseInt(is.readLine());
        int n4 = Integer.parseInt(is.readLine());

        int a = max(n1,n2);
        int b = max(n3,n4);
System.out.println(max(a,b));




    }

}

