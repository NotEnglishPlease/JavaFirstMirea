package ru.mirea.task1;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of subtask: ");
        int num = in.nextInt();
        switch (num){
            case (3): task3(); break;
            case (4):
                for (int i = 0; i < args.length; i++)
                    System.out.print(args[i] + " ");
                break;
            case (5): task5(); break;
            case (6): task6(); break;
            case (7) :
                int number = in.nextInt();
                System.out.print (task7(number));
                break;
        }
    }

    public static void task3() {
        int[] arr = new int[(int) (Math.random()*100)];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (1+ Math.random()*100);
        System.out.print("\n Sum by for cycle:" + cycleFor(arr));
        System.out.print("\n Sum by while cycle:" + cycleWhile(arr));
        System.out.print("\n Sum by do while cycle:" + cycleDoWhile(arr));
    }

    public static int cycleFor(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = arr[i] + sum;
        return sum;
    }

    public static int cycleWhile(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i< arr.length) {
            sum = arr[i]+sum;
            i++;
        }
        return sum;
    }

    public static int cycleDoWhile(int[] arr) {
        int sum = 0;
        int i = 0;
        do {
            sum = arr[i]+sum;
            i++;
        } while(i < arr.length);
        return sum;
    }

    public static void task5() {
        for (int i = 1; i <= 10; i++)
            System.out.print("1/" + i + " ");
    }

    public static void task6() {
        Random rnd = new Random();
        int size = rnd.nextInt(17) + 3;
        int[] arr = new int[(int) size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++)
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
        }
    }

    public static int task7(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
