package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
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
=======


>>>>>>> 79ed4f236b5f917dd9edceb4bea08653e8d13a9c

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


        for (int i=0; i<3; i++)
        {
            System.out.print(a[i]+ " ");
        }

        for (int i=0; i<3; i++)
        {

            System.out.println(a[i]);

        }

    }
}
