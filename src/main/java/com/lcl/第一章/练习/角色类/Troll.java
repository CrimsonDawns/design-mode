package com.lcl.第一章.练习.角色类;

import com.lcl.第一章.练习.武器行为.KnifeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }
}
