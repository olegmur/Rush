package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        int b[] = new int[10];
        int c[] = new int[10];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < b.length; i++)
        {
            b[i] = Integer.parseInt(read.readLine());
        }

        reverse(b);

        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }


    }

    public static int[] reverse(int[] in)
    {
        int tmp;
        for (int i = 0; i < in.length / 2; i++)
        {
            tmp = in[in.length - 1 - i];
            in[in.length - 1 - i] = in[i];
            in[i] = tmp;
        }
    return(in);
    }
}




