package com.lcl.第三章.装饰者模式;

import com.lcl.第三章.装饰者模式.被装饰者.Beverage;
import com.lcl.第三章.装饰者模式.被装饰者.DeepRoasted;
import com.lcl.第三章.装饰者模式.被装饰者.Espresso;
import com.lcl.第三章.装饰者模式.被装饰者.HouseBlend;
import com.lcl.第三章.装饰者模式.装饰者.Mocha;
import com.lcl.第三章.装饰者模式.装饰者.Soy;
import com.lcl.第三章.装饰者模式.装饰者.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage deepRoasted = new DeepRoasted();
        deepRoasted = new Mocha(deepRoasted);
        deepRoasted = new Mocha(deepRoasted);
        deepRoasted = new Whip(deepRoasted);
        System.out.println(deepRoasted.getDescription() + " $" + deepRoasted.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
