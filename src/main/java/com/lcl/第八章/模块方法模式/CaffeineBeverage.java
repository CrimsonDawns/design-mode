package com.lcl.第八章.模块方法模式;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        brew();
        boilWater();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
