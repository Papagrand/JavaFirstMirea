package ru.mirea.task5;

public class Corgi extends Dog {
    public Corgi(String name, int age){
        super(name,age);
        setBreed("Corgi");
    }

    @Override
    public void Bark() {
        System.out.println("Bark!");
    }

    @Override
    public void soutInfo() {
        System.out.println("Порода: "+getBreed()+", кличка: "+getName()+", возраст:"+getAge());
    }
}
