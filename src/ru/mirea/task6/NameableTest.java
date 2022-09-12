package ru.mirea.task6;

public class NameableTest {
    public static void main(String[] args) {
        Animal animal=new Animal("Жираф");
        Planet planet=new Planet("Марс");
        System.out.println("Животное: "+animal.getName()+" ,планета: "+ planet.getName());
    }

}
