package com.javarush.test.level08.lesson08.task02;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{


    public static HashSet<Integer> createSet()
    {

        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
        {
            h.add(i);
        }

        return h;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> n = set.iterator();

       while (n.hasNext())
        {
            if(n.next()>10) {n.remove();}
        }
        return set;
    }



public static void main(String args[])
{

    removeAllNumbersMoreThan10(createSet());
  //  for (Integer n : removeAllNumbersMoreThan10(createSet()))
   // System.out.println(removeAllNumbersMoreThan10(createSet()));

}

}