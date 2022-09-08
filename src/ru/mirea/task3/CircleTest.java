package ru.mirea.task3;
import java.util.Scanner;
public class CircleTest {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double radius=scanner.nextDouble();
        System.out.print("Введите длину: ");
        double size=scanner.nextDouble();
        Circle first_circle=new Circle();
        first_circle.setRad(radius);
        first_circle.setLen(size);
        System.out.print("Значение радиуса: "+first_circle.getRad()+" Значение длины окружности: "+first_circle.getLen());

    }
}
