package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int a[];
        int n;
        a = new int[3];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<3; i++)
        {

            n=Integer.parseInt(reader.readLine());
            a[i]=n;

        }

        for (int i = a.length - 1; i >= 1; i--) {

            boolean sorted = true;

            for (int j = 0; j < i; j++) {

                if (a[j] < a[j+1]) {
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




            System.out.println(a[1]);


    }
}
