package com.lcl.第四章.工厂模式.披萨;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

