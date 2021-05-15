package com.geektech;
public abstract class Hero implements HavingSuperAbility {

    private int healthy;
    private int damage;


    public Hero(int healthy, int damage) {
        this.healthy = healthy;
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String applySuperAbility(){
        return "Critical";
    }
}


