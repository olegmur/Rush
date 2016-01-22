package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        int a[]={n1,n2,n3};


        for (int i = 0; i<2; i++)
            for (int j = 0; j<2; j++)

        if (a[j]>a[i])
        {int b=a[i];
        a[i]=a[j];
            a[j]=b;
        }
        for (int i = 0; i<3; i++)
        {System.out.print(a[i]+" ");
        if (i==3)
        {
            System.out.print(a[i]);

        }


        }



    }
}
