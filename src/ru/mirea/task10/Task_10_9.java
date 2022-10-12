package ru.mirea.task10;

public class Task_10_9 {
    static int rec(int a,int b){
        if (a-1>b){
            return 0;
        }
        if (a==0 || b==0){
            return 1;
        }
        return rec(a,b-1)+rec(a-1,b-1);
    }
    public static void main(String[] args) {
        System.out.println(rec(3, 2));
    }
}
