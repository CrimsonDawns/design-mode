package com.lcl.第五章.单件模式;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    //对象实例设置为静态，静态方法能访问属性并对属性赋值
    private volatile static ChocolateBoiler chocolateBoiler;

    //构造器设置为私有，防止类外部区域创建实例
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    //获得类实例的方法，确保实例只有一个，并在类外创建出对象实例
    public static ChocolateBoiler getInstance() {
        //双重检查加锁，确保多线程中创建的只有一个实例，并提高了性能
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
