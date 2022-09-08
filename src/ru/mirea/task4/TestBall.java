package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball=new Ball();
        System.out.println(ball.toString());
        ball.setXY(30,40);
        System.out.println(ball.toString());
        ball.move(5,-5);
        System.out.println(ball.toString());
    }
}
