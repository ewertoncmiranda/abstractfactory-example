package com.miranda.observer.general;

public abstract class Characters {

    int power ;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public abstract String callChar();



}
