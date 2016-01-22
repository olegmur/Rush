package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(is.readLine());
        int n2 = Integer.parseInt(is.readLine());
    if (n1<n2)
    {
        System.out.println(n1);

    }
        else System.out.println(n2);
    }
}