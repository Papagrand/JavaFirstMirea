package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args) {
        System.out.println("Магазин мебели");
        Bed bed=new Bed(20000,"white");
        Chair chair=new Chair(10000,"brown");
        Table table=new Table(12000, "grey");
        bed.sout_info();
        chair.sout_info();
        table.sout_info();
    }
}
