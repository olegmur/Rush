package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> s = new HashSet<String>();

        s.add("арбуз");
        s.add("банан");
        s.add("вишня");
        s.add("груша");
        s.add("дыня");
        s.add("ежевика");
        s.add("жень-шень");
        s.add("земляника");
        s.add("ирис");
        s.add("картофель");
    for (String t : s)
    {System.out.println(t);}
    }
}
