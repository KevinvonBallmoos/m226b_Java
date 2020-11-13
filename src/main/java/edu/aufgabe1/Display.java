package edu.aufgabe1;

import javax.swing.*;
import java.awt.*;


/**
 * Die Klasse Display stellt ein Fenster auf dem Bildschirm zur Verfügung, in welchem
 * Figur-Objekte dargestellt werden können.
 * Siehe auch Java-Grundkurs Abschnitt 10.2 und 10.3.
 *
 * @author Andres Scheidegger
 */
public class Display extends JFrame {

    /**
     * Konstruktor. Initialisiert das Fenster in der Mitte des Bildschirms und erzeugt ein
     * JFrame-Objekt, auf welchem die Figuren gezeichnet werden.
     */
    public Display(Compositum compositum) {
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

    private void createAndAddDrawingPanel() {
        // Das JPanel-Objekt ist ein Objekt einer anonymen Unterklasse von JPanel
        add(new JPanel() {
            // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
            // Methode beim Display aufruft.
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                draw(g);
            }
        });
    }

    /**
     * Zeichnet alle Figuren.
     *
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */
    private void draw(Graphics g) {
        for (Component component: getComponents()){
            if (component instanceof Rectangle){
                Rectangle rectangle = (Rectangle) component;
                rectangle.draw(g);
            }
            if (component instanceof Circle){
                Circle circle = (Circle) component;
                circle.draw(g);
            }
            if (component instanceof Line){
                Line line = (Line) component;
                line.draw(g);
            }

        }

    }
    public void display(){
        repaint();
    }


}
