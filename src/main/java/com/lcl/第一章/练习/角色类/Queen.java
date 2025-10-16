package com.lcl.第一章.练习.角色类;

import com.lcl.第一章.练习.武器行为.BowAndArrowBehavior;
import com.lcl.第一章.练习.武器行为.SwordBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
