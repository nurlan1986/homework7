package com.geektech;

public class Medic extends Hero{
    public Medic(int healthy, int damage) {
        super(healthy, damage);
    }

    @Override
    public String applySuperAbility() {
        return "medic  применил силу лечение";
    }
}
