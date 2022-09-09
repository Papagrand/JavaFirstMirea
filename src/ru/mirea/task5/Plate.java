package ru.mirea.task5;

    public class Plate extends Dish {
        public Plate(double volume, String colour) {
            super(volume, colour);
            setType("Тарелка");
        }

        @Override
        public void drop() {
            System.out.println("Тарелку уронили. Она разбилась");
        }

        @Override
        public void soutDish() {
            System.out.println("Тип посуды: " + getType() + ", объем: " + getVolume() + ", цвет: " + getColour());
        }
    }
