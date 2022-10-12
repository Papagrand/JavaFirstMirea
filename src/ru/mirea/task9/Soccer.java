package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Soccer {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Матч: Реал - Барселона");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(1280,720);
        jFrame.getContentPane().setLayout(null);

        JButton leftTeamGoalButton = new JButton();
        JButton rightTeamGoalButton = new JButton();
        leftTeamGoalButton.setText("Реал забил");
        leftTeamGoalButton.setSize(150,100);
        leftTeamGoalButton.setLocation(426,300);
        rightTeamGoalButton.setText("Барселона забила");
        rightTeamGoalButton.setSize(150,100);
        rightTeamGoalButton.setLocation(676,300);

        jFrame.add(leftTeamGoalButton);
        jFrame.add(rightTeamGoalButton);

        final int[] RealScore = {0};
        final int[] BarcelonaScore={0};

        JLabel table = new JLabel("Result: "+RealScore[0]+" X "+BarcelonaScore[0]);
        table.setSize(200,100);
        table.setFont(new Font("Verdana",Font.PLAIN,15));
        table.setBounds(570,120,200,100);
        jFrame.add(table);

        JLabel lastScorer = new JLabel("Last scorer: ");
        lastScorer.setSize(200,100);
        lastScorer.setFont(new Font("Verdana",Font.PLAIN,15));
        lastScorer.setBounds(570,150,200,100);
        jFrame.add(lastScorer);

        JLabel winnerLable = new JLabel("Winner: ");
        winnerLable.setSize(200,100);
        winnerLable.setFont(new Font("Verdana",Font.PLAIN,15));
        winnerLable.setBounds(570,90,200,100);
        jFrame.add(winnerLable);



        leftTeamGoalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RealScore[0] +=1;
                table.setText("Result: "+RealScore[0]+" X "+BarcelonaScore[0]);
                lastScorer.setText("Last scorer: Реал");
                if(RealScore[0]>5 && BarcelonaScore[0]<=5){
                    winnerLable.setText("Winner: Реал");
                }
            }
        });
        rightTeamGoalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarcelonaScore[0] +=1;
                table.setText("Result: "+RealScore[0]+" X "+BarcelonaScore[0]);
                lastScorer.setText("Last scorer: Барселона");

                if(BarcelonaScore[0]>5 && RealScore[0]<=5){
                    winnerLable.setText("Winner: Барселона");
                }
            }
        });




        jFrame.setLocationRelativeTo(null);

    }
}
