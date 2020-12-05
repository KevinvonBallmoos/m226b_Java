package edu.Grafikeditor.controller;

import edu.Grafikeditor.model.Figure;
import edu.Grafikeditor.model.Compositum;
import edu.Grafikeditor.model.EditorState;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;


/**
 * class Display, creates a Window, so Figures can be drawn on it
 *
 * @author Kevin
 */
public class Display extends JFrame {

    @Getter
    private Compositum compositum;

    /**
     * 1. Constructor, initializes the Window in the center of the screen an creates an JFrame-object,
     * on wich Figures can be drawn
     *
     * @param compositum required to get the components in the Array components
     */
    public Display(Compositum compositum) {
        this.compositum = compositum;

        Dimension windowSize = new Dimension(600, 600);
        setSize(windowSize);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int windowPositionX = (screenSize.width - windowSize.width) / 2;
        int windowPositionY = (screenSize.height - windowSize.height) / 2;
        Point windowPosition = new Point(windowPositionX, windowPositionY);
        setLocation(windowPosition);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createAndAddDrawingPanel();
        setResizable(false);
        setVisible(true);
    }

    /**
     * creates and draws a new JPanel
     * painComponent method gets called automatically, as soon the repaint method gets called in display
     */
    private void createAndAddDrawingPanel() {
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                draw(graphics);
            }
        });
    }

    /**
     * draw method to call the specific draw method in circle, line or rectangle
     *
     * @param graphics reference to the Graphics object, to draw
     */

    private void draw(Graphics graphics) {
        for (Component component : compositum.getComponents()) {
            if (component instanceof Figure) {
                Figure figure = (Figure) component;
                figure.draw(graphics);
            }
        }
    }

    /**
     * calls the repaint method, which calls the paintComponent method
     */
    public void display() {
        repaint();
    }


    /**
     * creates a new state of composite with the actual content
     *
     * @return actual state of composite
     */
    public EditorState createState() {
        return new EditorState(compositum);
    }

    /**
     * @param state actual state of composite
     */
    public void undo(EditorState state) {
        compositum = state.getCompositum();
    }
}
