package com.lcl.第十二章.复合模式.例子;

public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
