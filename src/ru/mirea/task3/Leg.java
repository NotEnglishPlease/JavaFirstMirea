package ru.mirea.task3;

public class Leg {
    boolean hair, polish;
    int scar, power;
    public void changeScar(int newScar) {
        this.scar+=newScar;
    }
    public void changePolish() {
        this.polish =! polish;
    }
    public void changePower(int newScar) {
        this.power+=newScar;
    }
    public void changeHair() {
        this.hair =! hair;
    }
}
