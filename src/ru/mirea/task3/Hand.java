package ru.mirea.task3;

public class Hand {
    boolean polish, wedRing, main;
    int scar, power;

    @Override
    public String toString() {
        return "Hand{" +
                "polish=" + polish +
                ", wedRing=" + wedRing +
                ", scar=" + scar +
                ", power=" + power +
                ", main=" + main +
                '}';
    }

    public void changeScar(int newScar) {
        this.scar+=newScar;
    }
    public void changePolish() {
        this.polish =! polish;
    }
    public void changePower(int newScar) {
        this.power+=newScar;
    }
    public void changeWed() {
        this.wedRing =! wedRing;
    }
}
