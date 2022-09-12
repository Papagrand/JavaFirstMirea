package ru.mirea.task6;

public class Cookies implements Priceable{
    int price;
    public Cookies(int price){
        this.price=price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
