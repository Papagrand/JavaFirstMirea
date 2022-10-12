package ru.mirea.task10;

import java.util.Scanner;

public class Task10_11 {
    public static int rec(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n==1){
            int m=scanner.nextInt();
            if(m==1){
                return rec()+m+n;
            }else{
                int k=scanner.nextInt();
                if(k==1){
                    return rec()+n+k;
                }else{
                    return n;
                }
            }

        }
        else {
            int k=scanner.nextInt();
            if(k==1){
                return rec()+k;
            }else{
                return 0;
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Введите Последовательность натуральных чисел: ");
        System.out.println(rec());
    }
}
