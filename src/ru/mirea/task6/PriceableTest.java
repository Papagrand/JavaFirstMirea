package ru.mirea.task6;

public class PriceableTest {
    public static void main(String[] args) {
        LapTop lapTop=new LapTop(25000);
        Cookies cookies=new Cookies(120);
        System.out.println("Ноутбук стоит: "+lapTop.getPrice()+" рублей ,печеньки: "+ cookies.getPrice()+" рублей");
    }
}
