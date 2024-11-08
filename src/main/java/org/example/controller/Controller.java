package org.example.controller;
import org.example.action.ActionDraw;
import org.example.model.Model;
import org.example.model.MyShape;
import org.example.model.fill.NoFill;
import org.example.view.MyFrame;
import org.example.view.MyPanel;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
public class Controller {
    private Model model;
    private MyFrame frame;
    private MyPanel panel;
    private ActionDraw actionDraw;
    private static Controller instance;
    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    private Controller() {
        model = new Model();
        MyShape sampleShape = new MyShape(new Rectangle2D.Double());
        sampleShape.setFb(new NoFill());
        model.setMyShape(sampleShape);
        actionDraw = new ActionDraw(model, sampleShape);
        panel = new MyPanel(this);
        model.addObserver(panel);
        frame = new MyFrame(this);
        frame.setPanel(panel);
        frame.setJMenuBar(MenuController.getInstance().getMenuBar()); // Установка меню
    }
    public void mousePressedAction(Point p) {
        actionDraw.createShape(p);
    }
    public void mouseDraggedAction(Point p) {
        actionDraw.stretShape(p);
    }
    public void draw(Graphics2D g2) {
        model.draw(g2);
    }
}
