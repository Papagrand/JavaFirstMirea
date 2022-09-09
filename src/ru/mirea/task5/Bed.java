package ru.mirea.task5;

public class Bed extends Furniture{
    public Bed(int cost,String colour){
        super(colour,cost);
        setType("Кровать");
    }

    @Override
    public void sout_info() {
        System.out.println("Тип мебели: "+getType()+" ,цвет: "+getColour()+" ,цена: "+getCost());
    }
}
