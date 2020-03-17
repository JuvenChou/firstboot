package com.mozimentu.com;

import java.util.ArrayList;
import java.util.Date;

public class Basic {
    public Basic() {
    }

    private static final int C=1;


    public static void main(String[] args) {
        System.out.println("Basic.main");

        System.out.println("NO MORE");

        //TODO 注释C1
        ArrayList list = new ArrayList();
        list.add("t1");
        list.add("t2");
        list.add("t3");
        list.add("t4");

        Date date = new Date();

        System.out.println("Common update,pc_zhoujun.");

        System.out.println("Common update,mac_zhoujun.");

        System.out.println("args = [" + args + "]");
        for (int i = 0; i < list.size() ;i++) {
            System.out.println(list.get(i));

        }

        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println(arg);
            System.out.println("i = " + i);

        }
    }

    public void add() {
        System.out.println("Basic.add");
        
        String s = null;
        if (s == null) {
            
        }else if (s != null) {

        }


    }
}
