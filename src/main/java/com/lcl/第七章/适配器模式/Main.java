package com.lcl.第七章.适配器模式;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        EnumeratorIterator iterator = new EnumeratorIterator(list.iterator());
        while (iterator.hasMoreElements()) {
            System.out.println(iterator.nextElement());
        }
    }
}
