package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a[];
        int n;
        a = new int[5];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++)
        {

            n=Integer.parseInt(reader.readLine());
            a[i]=n;

        }

        for (int i = a.length - 1; i >= 1; i--) {
    
            boolean sorted = true;

            for (int j = 0; j < i; j++) {

                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sorted = false;
                }
            }

            if(sorted) {
                break;
            }
        }


        for (int i=0; i<5; i++)
        {

            System.out.println(a[i]);

        }


    }
}
