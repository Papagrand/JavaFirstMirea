package ru.mirea.task3;

import java.util.Arrays;

class Head{
    private String hair_colour;
    private String eyeColour;
    private int beardLength;
    Head(String hair_colour,String eyeColour, int beardLength){
        this.hair_colour=hair_colour;
        this.eyeColour=eyeColour;
        this.beardLength=beardLength;
    }

    @Override
    public String toString() {
        return "Head{" +
                "hair_colour='" + hair_colour + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                ", beardLength=" + beardLength +
                '}';
    }
}
class Leg{
    private double foot_size;
    Leg(double foot_size){
    this.foot_size=foot_size;
    }

    public double getFoot_size() {
        return foot_size;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "foot_size=" + foot_size +
                '}';
    }
}
class Hands{
    private double hand_length;
    Hands(double hand_length){
        this.hand_length=hand_length;
    }

    public double getHand_length() {
        return hand_length;
    }

    @Override
    public String toString() {
        return "Hands{" +
                "hand_length=" + hand_length +
                '}';
    }
}
public class Human {
   private Head head;
   private Hands[] hands;
   private Leg[] legs;

   public Human(Head head, Hands[] hands,Leg[] legs){
    this.head=head;
    this.hands=hands;
    this.legs=legs;
   }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", hands=" + Arrays.toString(hands) +
                ", legs=" + Arrays.toString(legs) +
                '}';
    }
}
