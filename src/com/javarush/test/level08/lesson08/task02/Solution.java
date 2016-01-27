package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> n = new HashSet<Integer>();
for (int i = 0; i < 20; i++)
{
    n.add(i);

}
    return n;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        for(Integer k : set)
        {if (k>10)
            System.out.println(k);
            set.remove(k);}


        return set;
    }
    public static void main(String[] args)
    {
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }



}
