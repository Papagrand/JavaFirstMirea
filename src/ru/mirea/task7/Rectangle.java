package ru.mirea.task7;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){};

    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle:\t Color:" + getColor() + "\tisFilled:" + isFilled() + "\tArea:" + getArea() + "\tPerimeter:" + getPerimeter() + "\n";
    }
}
