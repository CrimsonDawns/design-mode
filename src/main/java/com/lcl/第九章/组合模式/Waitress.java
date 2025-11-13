package com.lcl.第九章.组合模式;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.creatIterator();
        System.out.println("\nVEGETARIAN MENU\n-----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {

                }
            } catch (UnsupportedOperationException e) {

            }
        }
    }
}

