package ru.mirea.task8;

import ru.mirea.task7.Shape;

public class Circle {
    protected int radius;
    protected String color;
    protected int x,y;
    public Circle(){};


    public Circle(int radius, String color,int x, int y){
        this.radius=radius;
        this.color=color;
        this.x=x;
        this.y=y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
