package com.lcl.第七章.外观模式;

public class Screen {
    public void up() {
        System.out.println("Theater Screen going up");
    }

    public void down() {
        System.out.println("Theater Screen going down");
    }

    @Override
    public String toString() {
        return "Theater Screen";
    }
}

