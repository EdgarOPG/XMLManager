/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uach.GUI;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author edgar
 */
 
public class BeforeClosing {
    JTextField[] fields;
 
    private JPanel getContent() {
        String[] strs = { "user", "enters", "text" };
        fields = new JTextField[strs.length];
        JPanel panel = new JPanel();
        for(int i = 0; i < fields.length; i++) {
            fields[i] = new JTextField(strs[i], 6);
            panel.add(fields[i]);
        }
        return panel;
    }
 
    public static void main(String[] args) {
        BeforeClosing test = new BeforeClosing();
        JFrame f = new JFrame();
        // Use a WindowListener instead of
        // f.setDefaultCloseOperation(...);
        f.addWindowListener(test.closeMonitor);
        f.add(test.getContent());
        f.setSize(300,140);
        f.setLocation(200,200);
        f.setVisible(true);
    }
 
    private WindowListener closeMonitor = new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            for(int i = 0; i < fields.length; i++) {
                System.out.printf("fields[%d] text = %s%n",
                                   i, fields[i].getText());
            }
            System.exit(0);
        }
    };
}