package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

  /*  public static void main (String[] args)
    {
        removeTheFirstNameDuplicates(createMap());
        for (Map.Entry<String, String> n : removeTheFirstNameDuplicates(createMap()).entrySet())
        System.out.println(n.getKey()+" "+ n.getValue());

    }*/


    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Mur1", "Mur2");
        map.put("Mur2", "Mur2");
        map.put("Mur3", "Mur3");
        map.put("Mur4", "Mur4");
        map.put("Mur5", "Mur5");
        map.put("Mur6", "Mur5");
        map.put("Mur7", "Mur4");
        map.put("Mur8", "Mur6");
        map.put("Mur9", "Mur8");
        map.put("Mur10", "Mur8");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        for (Map.Entry<String, String> k: map2.entrySet())
        {
           map3.remove(k.getKey());

                if (map3.containsValue(k.getValue()))
                {
                removeItemFromMapByValue(map, k.getValue());
                           }

        }

        //return map;
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
