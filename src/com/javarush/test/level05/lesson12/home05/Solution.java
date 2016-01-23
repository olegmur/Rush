package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String K="";
        int summa = 0;


        while (K!="сумма")

        {
            K = reader.readLine();
            if (K.equals("сумма"))
            break;
            else
            {
                int T = Integer.parseInt(K);
                summa = summa + T;
            }
        }
        System.out.println(summa);
    }



}



