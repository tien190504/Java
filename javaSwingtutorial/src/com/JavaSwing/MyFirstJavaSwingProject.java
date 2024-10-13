package com.JavaSwing;

import javax.swing.JFrame;

public class MyFirstJavaSwingProject {
    
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        //Gan ten
        jf.setTitle("Hello Swing");
        //Gan kich co
        jf.setSize(600, 400);
        //Gan vi tri hien thi
        jf.setLocation(300, 300);
        // Thoat ra khoi chuong trinh khi dong cua so JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Cho phep hien thi
        jf.setVisible(true);
    }
}
