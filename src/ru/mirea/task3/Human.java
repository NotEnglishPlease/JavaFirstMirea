package ru.mirea.task3;

public class Human {
    Head head;
    Leg rightLeg, leftLeg;
    Hand rightHand, leftHand;

    String name;

    public Human(Head head, Leg rightLeg, Leg leftLeg, Hand rightHand, Hand leftHand) {
        this.head = head;
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.rightHand = rightHand;
        this.leftHand = leftHand;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", rightLeg=" + rightLeg +
                ", leftLeg=" + leftLeg +
                ", rightHand=" + rightHand +
                ", leftHand=" + leftHand +
                ", name=" + name +

                '}';
    }
}
