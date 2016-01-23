package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

import javafx.util.converter.IntegerStringConverter;

public class Solution
{

    public static void main(String[] args)
    {
        Zerg s1 = new Zerg();
        s1.name="1";
        Zerg s2= new Zerg();
        s2.name="2";
        Zerg s3 = new Zerg();
        s3.name="3";
        Zerg s4 = new Zerg();
        s4.name="4";
        Zerg s5 = new Zerg();
        s5.name="5";
        Zerg s6 = new Zerg();
        s6.name="6";
        Zerg s7 = new Zerg();
        s7.name="7";
        Zerg s8 = new Zerg();
        s8.name="8";
        Zerg s9 = new Zerg();
        s9.name="9";
        Zerg s10 = new Zerg();
        s10.name="10";
        Protos p = new Protos();
        p.name="2";
        Protos p2 = new Protos();
        p2.name="3";
        Protos p4= new Protos();
        p4.name="4";
        Protos p5 = new Protos();
        p5.name="34";
        Protos p6 = new Protos();
        p6.name="43";
        Terran t = new Terran();
        t.name="sd";
        Terran t2 = new Terran();
        t2.name="sds";
        Terran t3 = new Terran();
        t3.name="sda";
        Terran t4 = new Terran();
        t4.name="sdf";
        Terran t5 = new Terran();
        t5.name="dgq";
        Terran t6 = new Terran();
        t6.name="dy";
        Terran t7 = new Terran();
        t7.name="fa";
        Terran t8 = new Terran();
        t8.name="dsfq";
        Terran t9 = new Terran();
        t9.name="fw";
        Terran t10 = new Terran();
        t10.name="fgw";
        Terran t11 = new Terran();
        t11.name="dsgqe";
        Terran t12 = new Terran();
        t12.name="dgoq";




    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}