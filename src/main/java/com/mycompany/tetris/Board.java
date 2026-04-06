package com.mycompany.tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
    
    public static final int BOARD_WIDTH = 10;
    public static final int BOARD_HEIGHT = 20;
    public static final int BLOCK_SIZE = 30;
    private Timer looper;
    private Color[][] board = new Color[BOARD_WIDTH][BOARD_HEIGHT];
    
    public Board(){
        looper = new Timer(500,new ActionListener() {
            int n = 0;
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println(n++);
                
            }
        });
        looper.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.black);
        g.fill3DRect(0, 0, getWidth(), getHeight(), true);
        g.draw3DRect(10, 10, 200, 200, true);
        g.setColor(Color.white);
        
        for (int row = 0; row < BOARD_HEIGHT; row++) {
            g.drawLine(0, BLOCK_SIZE * row, BLOCK_SIZE * BOARD_WIDTH,BLOCK_SIZE * row);
        }
        
        for (int col = 0; col < BOARD_HEIGHT; col++) {
            g.drawLine(0, 0, BLOCK_SIZE * BOARD_WIDTH, BLOCK_SIZE * BOARD_HEIGHT);
        }
    }
    
}
