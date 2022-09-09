package ru.mirea.task5;

public class JackRussel extends Dog{
    public JackRussel(String name, int age){
        super(name,age);
        setBreed("Jack Russel");
    }

    @Override
    public void Bark() {
        System.out.print("Bark!");
    }

    @Override
    public void soutInfo() {
        System.out.println("Порода: "+getBreed()+", кличка: "+getName()+", возраст:"+getAge());
    }
}
