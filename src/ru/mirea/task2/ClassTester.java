package ru.mirea.task2;
import java.util.Scanner;

public class ClassTester {
    public static void main(String[] args) {
        Shape shape = new Shape("circle", 10, 4, 6);
        System.out.println(shape);
        Ball ball = new Ball("tennis", 10, 100);
        System.out.println(ball);
        ball.setColor("white");
        System.out.println("New ball color: " + ball.getColor());
        Scanner in = new Scanner(System.in);
        Book book1 = new Book ("Harry Potter", "fantasy");
        System.out.print("Input a book publisher: ");
        book1.setPublishHouse(in.next());
        book1.setPagesNum();
        System.out.println(book1);
    }
}
