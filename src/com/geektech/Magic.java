package com.geektech;

public class Magic extends Hero{


    public Magic(int healthy,int damage){
        super(healthy,damage);
    }

    @Override
    public String applySuperAbility(){
        super.applySuperAbility();
        return "Magic применил супер способность Strong";
    }
}
