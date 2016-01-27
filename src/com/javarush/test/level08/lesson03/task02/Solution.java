package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> t = new HashMap<String, String>();
        t.put("арбуз" , "ягода");
        t.put("банан" , "трава");
        t.put("вишня" , "ягода");
        t.put("груша" , "фрукт");
        t.put("дыня" , "овощ");
        t.put("ежевика" , "куст");
        t.put("жень-шень" , "корень");
        t.put("земляника" , "ягода");
        t.put("ирис" , "цветок");
        t.put("картофель" , "клубень");



        for (Map.Entry<String, String> p : t.entrySet())
        {
            System.out.println(p.getKey() + " - " + p.getValue());

        }


    }
}
