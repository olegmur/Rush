package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

       public static void main (String[] args)
    {
        removeAllSummerPeople(createMap());
       // for (Map.Entry<String, Date> n : removeAllSummerPeople(createMap()).entrySet())
        //System.out.println(n.getKey()+" "+ n.getValue());

    }



    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 7 1980"));
        map.put("Stallone5", new Date("JUNE 6 1980"));
        map.put("Stallone6", new Date("JUNE 8 1980"));
        map.put("Stallone7", new Date("JUNE 7 1980"));
        map.put("Stallone8", new Date("JUNE 8 1980"));
        map.put("Stallone9", new Date("JUNE 6 1980"));
        map.put("Stallone10", new Date("JUNE 9 1980"));
        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while(it.hasNext())
        {
            if (it.next().getValue().getMonth()>5 && it.next().getValue().getMonth()<9)
            {it.remove();
                System.out.println(it);
            }
        }




    }
}
