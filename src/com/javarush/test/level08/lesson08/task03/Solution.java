package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;

import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap <String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Mur6"));
        System.out.println(getCountTheSameLastName(map, "Mur1"));
    }


    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> n = new HashMap<String, String>();
        n.put("Mur3", "Mur3");
        n.put("Mur4", "Mur3");
        n.put("Mur2", "Mur1");
        n.put("Mur13", "Mur2");
        n.put("Mur4", "Mur5");
        n.put("Mur6", "Mur4");
        n.put("Mur7", "Mur3");
        n.put("Mur8", "Mur2");
        n.put("Mur9", "Mur1");
        n.put("Mur10", "Mur1");


        return n;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        for (Map.Entry<String, String> k: map.entrySet())
        {
            if (name.equals(k.getKey())) {i++;}
        }

        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int i = 0;
        for (Map.Entry<String, String> k: map.entrySet())
        {
                if (lastName.equals(k.getValue()))
                {i++;}
        }

        return i;
    }





}
