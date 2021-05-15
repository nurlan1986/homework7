package com.geektech;

public class Warrior extends Hero {
    public Warrior(int healthy, int damage) {
        super(healthy, damage);
    }

    @Override
    public String applySuperAbility() {
        super.applySuperAbility();

        return "Warrior применил силу супер удар";
    }
}
