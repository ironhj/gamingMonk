/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thegames;

import javax.swing.SwingUtilities;
/**
 *
 * @author Harsh Jaiswal
 */
public class TheGames {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GameMenu gameMenu = new GameMenu();
                gameMenu.setVisible(true);
            }
        });      
    }
}
