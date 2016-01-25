package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {

        ArrayList<String> l = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        for (int i = 0; i < 5; i++)
        {
            l.add(r.readLine());
        }

        s = l.get(0);
        str.add(0, s);
        for (int i = 1; i < l.size(); i++)
        {
            if (l.get(i).length() > s.length())
            {
                str.clear();
                s = l.get(i);
                str.add(l.get(i));
            } else if (l.get(i).length() == s.length())
            {
                str.add(l.get(i));

            } else
            {
            }


        }
        for (int t = 0; t < str.size(); t++)
            System.out.println(str.get(t));
    }
}
