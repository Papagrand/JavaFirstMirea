package ru.mirea.task6;

public class Animal implements Nameable {
        String name;
        public Animal(String name){
            this.name=name;
        }

    @Override
    public String getName() {
        return name;
    }
}
