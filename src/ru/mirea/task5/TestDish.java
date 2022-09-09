package ru.mirea.task5;

public class TestDish {
    public static void main(String[] args) {
        Plate plate = new Plate(0.5, "green");
        plate.drop();
        plate.soutDish();
        Pot pot=new Pot(3,"silver");
        pot.drop();
        pot.soutDish();
    }
}
