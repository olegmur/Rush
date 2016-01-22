package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       // BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
       // int m = Integer.parseInt(is.readLine());
       // int n = Integer.parseInt(is.readLine());

       // for (int i=0; i<10; i++)
        {
            String s = "";
            for (int j = 0; j < 10; j++)
            {
                s=s+"8";
                System.out.println(s);
            }

        }

    }
}
