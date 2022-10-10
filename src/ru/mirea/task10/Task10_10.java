package ru.mirea.task10;

import java.util.Scanner;

public class Task10_10 {
    static int rec(int a, int b){
        if(a==0){
            return b;
        }
        else{
            b=b*10+a%10;
            return rec(a/10,b);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите число:");
        System.out.println(rec(scanner.nextInt(), 0));
    }
}
