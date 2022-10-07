package ru.mirea.task2;

public class Shape {
    String name;
    int S, P, V;

    public Shape(String name, int S, int P, int V){
        this.name = name;
        this.S = S;
        this.P = P;
        this.V = V;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", S=" + S +
                ", P=" + P +
                ", V=" + V +
                '}';
    }
}
