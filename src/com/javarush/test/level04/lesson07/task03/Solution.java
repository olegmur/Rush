package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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

        int k=0,a[]={n1,n2,n3};

        for (int x=0; x<=2; x++)
        {
            if (a[x]>=0)
                k++;
            else
            {}
        }

        System.out.println(k);

    }
}
