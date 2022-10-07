package ru.mirea.task2;

public class Ball {
    String color, type;
    int V, m;

    public Ball (String type, int V, int m) {
        this.type=type;
        this.V=V;
        this.m=m;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", V=" + V +
                ", m=" + m +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
