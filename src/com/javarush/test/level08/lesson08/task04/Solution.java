package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("DECEMBER 1 1980"));
        map.put("Stallone10", new Date("SEPTEMBER 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashMap<String, Date> map2 = map;
        for (Map.Entry<String, Date> m: map.entrySet())
        {
            Date d = m.getValue();
            if (d.getMonth()+1>= 6 && d.getMonth()+1<=8)
            {
            map2.remove(m.getKey());
            }
        }
        map = map2;


    }


public static void main (String[] args)
{
    HashMap<String, Date> map = createMap();
    removeAllSummerPeople(map);

    for (Map.Entry<String, Date> m: map.entrySet())
    {
        System.out.println(m);
    }


}


}
