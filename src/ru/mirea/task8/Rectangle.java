package ru.mirea.task8;

import ru.mirea.task7.Shape;

public class Rectangle{
    protected int width;
    protected int length;
    protected int x;
    protected int y;

    public Rectangle(){};

    public Rectangle(int width, int length, int x, int y){
        this.length=length;
        this.width=width;
        this.x=x;
        this.y=y;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
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

}
