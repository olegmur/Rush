package com.javarush.test.level04.lesson13.task05;

import java.io.*;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        String m = is.readLine();
        // int n = Integer.parseInt(is.readLine());

        // for (int i=0; i<10; i++)
        {
            String s = "";
            for (int j = 0; j < 10; j++)
            {
             ///   s=s+"8";
                System.out.println(m + " любит меня.");
            }

        }

    }
}
