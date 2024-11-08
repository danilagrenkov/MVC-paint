package org.example.controller;
import javax.swing.*;
public class MenuController {
    private static MenuController instance;
    private JMenuBar menuBar;
    private ShapeType selectedShape;
    private MenuController() {
        menuBar = new JMenuBar();
        menuBar.add(createShapeMenu());
    }
    public static MenuController getInstance() {
        if (instance == null) {
            instance = new MenuController();
        }
        return instance;
    }
    public JMenuBar getMenuBar() {
        return menuBar;
    }
    private JMenu createShapeMenu() {
        JMenu shapeMenu = new JMenu("Фигура");
        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem square = new JRadioButtonMenuItem("Прямоугольник");
        square.addActionListener(e -> selectedShape = ShapeType.RECTANGULAR);
        shapeMenu.add(square);
        group.add(square);
        JRadioButtonMenuItem ellipse = new JRadioButtonMenuItem("Эллипс");
        ellipse.addActionListener(e -> selectedShape = ShapeType.ELLIPSE);
        shapeMenu.add(ellipse);
        group.add(ellipse);
        // Установка фигуры по умолчанию
        square.setSelected(true);
        selectedShape = ShapeType.RECTANGULAR;
        return shapeMenu;
    }
    public ShapeType getSelectedShape() {
        return selectedShape;
    }
}
