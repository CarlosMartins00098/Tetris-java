package com.mycompany.tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
    
    private Timer looper;
    
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
        
        g.draw3DRect(10, 10, 200, 200, true);
    }
    
}
