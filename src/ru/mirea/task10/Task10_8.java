package ru.mirea.task10;

import java.util.Scanner;

public class Task10_8 {


    static String firstPalindrom(String str){
        if (str.charAt(0)==str.charAt(str.length()-1)){
            return secondPalindrom(str,1);
        }
        else {return "NO";}
    }

    static String secondPalindrom(String str, int i){
        if (i>str.length()/2){
            return "YES";
        }
        if (str.charAt(i)==str.charAt(str.length()-1-i)){
            return secondPalindrom(str, ++i);
        }
        else{
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите слово:");
        String word=scanner.next();
        System.out.println(firstPalindrom(word));
    }
}
