package ru.mirea.task6;

public class LapTop implements Priceable {
    int price;
    public LapTop(int price){
        this.price=price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
