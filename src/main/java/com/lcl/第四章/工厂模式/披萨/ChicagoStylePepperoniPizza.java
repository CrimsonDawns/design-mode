package com.lcl.第四章.工厂模式.披萨;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

