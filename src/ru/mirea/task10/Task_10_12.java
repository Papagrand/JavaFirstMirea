package ru.mirea.task10;

import java.util.Scanner;

public class Task_10_12 {
    public static void rec(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0){
            if (n % 2 == 1){
                System.out.println("Нечетное число последовательности | "+ n + " |");
                rec();
            } else
                rec();
        }
    }

    public static void main(String[] args){
        System.out.println("Введите последовательность натуральных чисел:");
        rec();
    }
}
