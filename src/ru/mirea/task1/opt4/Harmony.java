package ru.mirea.task1.opt4;

public class Harmony {
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summ=0;
        for(int i=0;i<10;i++){
            summ+=b[i];

        }
        System.out.println("Сумма через цикл for " + summ);
        summ=0;
        int i=0;
        while(i<=9){
            summ+=b[i];
            i++;
        }
        System.out.println("Сумма через цикл while " + summ);
        summ=0;
        i=0;
        do{
            summ+=b[i];
            i++;
        }while (i<=9);
        System.out.println("Сумма через цикл do while " + summ);
    }
    public static void fourth(String[] args){

    }
    public static void fifth(String[] args){
        double a=1;
        for(double i=1;i<11;i++){
            a=a/i;
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
