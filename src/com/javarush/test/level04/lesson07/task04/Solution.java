package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        int o=0, p=0,a[]={n1,n2,n3};

        for (int x=0; x<=2; x++)
        {
            if (a[x]>=0)
                p++;
            else
            {o++;}

        }

        System.out.println("количество отрицательных чисел: "+ o);
        System.out.println("количество положительных чисел: "+ p);
    }
}
