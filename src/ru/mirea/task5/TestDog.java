package ru.mirea.task5;

public class TestDog {
    public static void main(String[] args) {
        Corgi corgi=new Corgi("Puffik",4);
        corgi.soutInfo();
        System.out.print("Собака породы "+corgi.getBreed()+" говорит:");
        corgi.Bark();
        System.out.print("\n");

        JackRussel jackRussel=new JackRussel("Jack",8);
        jackRussel.soutInfo();
        System.out.print("Собака породы "+jackRussel.getBreed()+" говорит:");
        jackRussel.Bark();
        jackRussel.Bark();
        System.out.print("\n");
    }
}
