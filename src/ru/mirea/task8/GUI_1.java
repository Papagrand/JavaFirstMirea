package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class GUI_1 extends JPanel {
    public void paintComponent(Graphics graphics) {
        Scanner scanner = new Scanner(System.in);
        this.setBackground(Color.WHITE);
        int randX=(int)(10+Math.random()*1280);
        int randY=(int)(10+Math.random()*720);
            Random newColor = new Random();
            Color[] colours = {Color.BLACK, Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN, Color.PINK};
            int pos1 = newColor.nextInt(colours.length);
            int pos2 = newColor.nextInt(colours.length);
            int typeFigure = (int) (1 + Math.random() * 2);
            System.out.println(typeFigure);
        if (typeFigure == 1) {
                Rectangle rectangle = new Rectangle();

                int randWidth=(int)(10+Math.random()*200);
                int randLength=(int)(10+Math.random()*200);
                rectangle.x = randX;
                rectangle.y = randY;
                rectangle.width = randWidth;
                rectangle.length = randLength;
                System.out.println("Координаты и размеры прямоугольника: "+rectangle.x+" "+rectangle.y+" "+rectangle.width+" "+rectangle.length);
                graphics.setColor(colours[pos1]);
                graphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.length);
            } else {
                Circle circle = new Circle();
                int randRadius=(int)(10+Math.random()*200);
                circle.x = randX;
                circle.y = randY;
                circle.radius = randRadius;
            System.out.println("Координаты и размеры прямоугольника: "+circle.x+" "+circle.y+" "+circle.radius);
            graphics.setColor(colours[pos2]);
                graphics.fillOval(circle.x, circle.y, circle.radius, circle.radius);
            }


    }
}

