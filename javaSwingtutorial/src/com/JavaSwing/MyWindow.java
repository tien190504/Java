package com.JavaSwing;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
    public MyWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showMyWindow() {
        this.setVisible(true);
    }
    public void showMyWindow(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        MyWindow m1 = new MyWindow();
        m1.showMyWindow();
        MyWindow m2 = new MyWindow();
        m2.showMyWindow("My Window", 500, 500);
    }
}
