package ru.mirea.task3;
import java.util.Scanner;
public class HumanTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите параметры головы\n");
        System.out.print("Введите цвет волос: ");
        String hC=scanner.next();
        System.out.print("Введите цвет глаз: ");
        String eC=scanner.next();
        System.out.println("Введите длину бороды: ");
        int bL=scanner.nextInt();
        Head head=new Head(hC,eC,bL);
        int handLen=scanner.nextInt();
        double legLength=scanner.nextDouble();
        Human human=new Human(head, new Hands[]{new Hands(handLen),new Hands(handLen)}, new Leg[]{new Leg(legLength),new Leg(legLength)});
        System.out.println(human);
    }

}
