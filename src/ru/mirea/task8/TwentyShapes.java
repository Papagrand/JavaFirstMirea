package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class TwentyShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("20 Фигур");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI_1 gui_1 = new GUI_1();
        for(int i=0;i<10;i++) {
            System.out.println(i);
            gui_1.setBackground(Color.WHITE);
            frame.setSize(1920, 1080);
            frame.add(gui_1);
            frame.setVisible(true);
}

    }
}
