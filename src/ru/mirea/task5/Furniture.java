package ru.mirea.task5;

public abstract class Furniture{
    private String type;
    private String colour;
    private int cost;
    public Furniture(String colour,int cost){
        this.cost=cost;
        this.colour=colour;
    }
    public abstract void sout_info();

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
