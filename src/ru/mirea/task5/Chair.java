package ru.mirea.task5;

public class Chair extends Furniture{
    public Chair(int cost,String colour){
        super(colour,cost);
        setType("Кресло");
    }

    @Override
    public void sout_info() {
        System.out.println("Тип мебели: "+getType()+" ,цвет: "+getColour()+" ,цена: "+getCost());
    }
}
