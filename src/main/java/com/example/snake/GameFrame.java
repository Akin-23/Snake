package com.example.snake;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame (){
        // subclass of JFrame, so can add GamePanel into Frame
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // take a JFRame and fit snugly around all components added to frame.
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
