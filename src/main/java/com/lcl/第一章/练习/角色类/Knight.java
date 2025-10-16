package com.lcl.第一章.练习.角色类;

import com.lcl.第一章.练习.武器行为.AxeBehavior;

public class Knight extends Character{
    public Knight() {
        weaponBehavior = new AxeBehavior();
    }
}
