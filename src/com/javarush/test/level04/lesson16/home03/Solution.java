package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        //String m = is.readLine();
        // String n = is.readLine();
        int k=0;
        int n1 = Integer.parseInt(is.readLine());
        while (n1!=-1)
        {k+=n1;
            n1 = Integer.parseInt(is.readLine());
        }
        k=k-1;

        //int n2 = Integer.parseInt(is.readLine());
       // int n3 = Integer.parseInt(is.readLine());
        System.out.println(k);

    }
}
