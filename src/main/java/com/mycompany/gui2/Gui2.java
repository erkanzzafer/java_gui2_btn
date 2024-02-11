/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class Gui2 {

    //setBounds(x,y,width,height);
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton btn = new JButton("Gönder");

        btn.setBounds(0, 0, 100, 30);
        btn.setText("Kaydet");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("tıklandı!!");
            }
        });

        frame.add(btn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
