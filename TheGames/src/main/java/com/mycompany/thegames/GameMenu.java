/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thegames;

/**
 *
 * @author Harsh Jaiswal
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMenu extends JFrame {

    public GameMenu() {
        setTitle("Game Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBackground(Color.BLACK);

        JLabel titleLabel = new JLabel("The Game");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton startButton1 = new JButton("Brick-Breaker");
        startButton1.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj=new JFrame();
                GamePlay gamePlay=new GamePlay();
                obj.setBounds(10,10,700,600);
                obj.setTitle("Brick Breaker Game");
                obj.setResizable(false);
                obj.setVisible(true);
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.add(gamePlay);
            }
        });
        JButton startButton2 = new JButton("Snake");
        startButton2.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameFrame gameFrame = new GameFrame();
            }
        });
        
        JButton startButton3 = new JButton("Tic Tac Toe");
        startButton3.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTacToe tictactoe = new TicTacToe();
            }
        });
        
        JButton startButton4= new JButton("Java Quiz Game");
        startButton4.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quiz quiz = new Quiz();
            }
        });
        
        JButton exitButton = new JButton("Exit");
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuPanel.add(Box.createVerticalGlue());
        menuPanel.add(titleLabel);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        menuPanel.add(startButton1);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        menuPanel.add(startButton2);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        menuPanel.add(startButton3);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        menuPanel.add(startButton4);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        menuPanel.add(exitButton);
        menuPanel.add(Box.createVerticalGlue());

        add(menuPanel);
    }
}