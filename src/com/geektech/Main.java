package com.geektech;

public class Main {

    public static void main(String[] args) {
        Medic Medic = new Medic(100,50);
        System.out.println("--------------------------");
        Magic Magic = new Magic(95,45);
        Warrior Warrior = new Warrior(90,40);

        Hero[] array = {Magic,Medic,Warrior};
        for(int i = 0; i<array.length; i++) {
            System.out.println(array[i].applySuperAbility());
        }

    }
}
