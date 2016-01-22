package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(read.readLine());
        int n2 = Integer.parseInt(read.readLine());
        int n3 = Integer.parseInt(read.readLine());
        
        int a[]={n1,n2,n3};
        if (a[0]==a[1])
            System.out.println("3");

        else if (a[1]==a[2])
            System.out.println("1");
        else
            System.out.println("2");

    }
}
