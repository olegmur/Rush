package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a[][] = new int[10][10];
        int i=0, j;
        while (i<10)
        {
            j=0;
            while (j<10)
            {
               a[i][j]=(i+1)*(j+1);
               j++;
            }

            i++;
        }
        int k=0;
        while (k<10)
        {
            int n = 0;
            while (n<10)
            {
                if (n<9)
                System.out.print(a[k][n] + " ");
                else
                    System.out.print(a[k][n]);
                n++;
            }
            System.out.println();
        k++;
        }
    }
}
