package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s="";
        for (int i=0; i<5; i++)
        {
            s = r.readLine();
            list.add(s);
        }
        s=list.get(0);
        str.add(0,s);
        for (int i=1; i < list.size(); i++)
        {
            if (list.get(i).length() < s.length())
            {
               str.clear();
               s=list.get(i);
               str.add(list.get(i));
            }
            else if (list.get(i).length() == s.length())
            {
                str.add(list.get(i));

            }
            else {}




        }
        for (int t = 0; t < str.size(); t++)
            System.out.println(str.get(t));





    }
}
