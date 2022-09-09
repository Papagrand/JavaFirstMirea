package ru.mirea.task5;

public abstract class Dog {
    private String name;
    private int age;
    private String breed;

    public abstract void Bark();
    public abstract void soutInfo();
    public Dog(String name, int age){
        this.age=age;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
