package com.lcl.第一章.练习.角色类;

import com.lcl.第一章.练习.武器行为.WeaponBehavior;

public abstract class Character {

    public WeaponBehavior weaponBehavior;

    public void flight() {
        weaponBehavior.useWeapon();
    }


    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
