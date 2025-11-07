package com.lcl.第七章.外观模式;

public class PopcornPopper {
    public void on() {
        System.out.println("Popcorn Popper on");
    }

    public void off() {
        System.out.println("Popcorn Popper off");
    }

    public void pop() {
        System.out.println("Popcorn Popper popping popcorn!");
    }

    @Override
    public String toString() {
        return "Popcorn Popper";
    }
}

