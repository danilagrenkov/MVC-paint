/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.view;

import org.example.controller.Controller;

import javax.swing.JFrame;
import java.awt.*;

import javax.swing.*;
public class MyFrame extends JFrame {
    private MyPanel panel;
    public MyFrame(Controller controller) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public MyFrame(Controller controller) {
    }

    public MyFrame(Controller controller) {
    }

    public void setPanel(MyPanel panel) {
        this.panel = panel;
        add(panel);
    }
}
