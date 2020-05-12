package com.ziembatomasz.game;

import java.applet.Applet;
import java.awt.*;

public class StartingClass extends Applet {
    @Override
    public void init() {

        setSize(800, 480);
        setBackground(Color.BLACK);
        setFocusable(true);
        Frame frame = (Frame) this.getParent().getParent();
        frame.setTitle("Q-Bot Alpha");
    }

    @Override
    public void start() {
        Thread thread = new Thread();
        thread.start();
    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }
    public void run() {
        while (true) {

            repaint();
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
