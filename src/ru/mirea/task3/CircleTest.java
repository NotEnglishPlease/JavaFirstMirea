package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 30, 20, 20);
        circle.setLen(25);
        System.out.println("New arc length = " + circle.getLen());
    }
}
