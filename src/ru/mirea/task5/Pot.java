package ru.mirea.task5;

public class Pot extends Dish {
    public Pot(double volume, String colour) {
        super(volume, colour);
        setType("Кастрюля");
    }

    @Override
    public void drop() {
        System.out.println("Кастрюлю уронили. Она помялась");
    }

    @Override
    public void soutDish() {
        System.out.println("Тип посуды: " + getType() + ", объем: " + getVolume() + ", цвет: " + getColour());
    }
}