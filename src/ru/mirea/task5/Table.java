package ru.mirea.task5;

public class Table extends Furniture{
    public Table(int cost,String colour){
        super(colour,cost);
        setType("Стол");
    }

    @Override
    public void sout_info() {
        System.out.println("Тип мебели: "+getType()+" ,цвет: "+getColour()+" ,цена: "+getCost());
    }
}
