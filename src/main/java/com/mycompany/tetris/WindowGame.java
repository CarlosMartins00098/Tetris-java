/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tetris;

import javax.swing.JFrame;

/**
 *
 * @author carlos
 */
public class WindowGame {
    public static final int WIDTH = 445, HEIGHT = 629;
        
    private JFrame window;
    
    public WindowGame(){
        window = new JFrame("Tetris");
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null); // spawna a janela sempre no meio ao invez do topo da tela
        
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new WindowGame();
    }
}
