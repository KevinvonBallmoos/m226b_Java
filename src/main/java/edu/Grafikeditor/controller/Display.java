package edu.Grafikeditor.controller;

import edu.Grafikeditor.model.Compositum;
import edu.Grafikeditor.model.Figure;

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


    private final Compositum components;

    /**
     * Konstruktor. Initialisiert das Fenster in der Mitte des Bildschirms und erzeugt ein
     * JFrame-Objekt, auf welchem die Figuren gezeichnet werden.
     */
    public Display(Compositum compositum) {
        this.components = compositum;
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
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                draw(graphics);
            }
        });
    }

    /**
     * Zeichnet alle Figuren.
     *
     * @param graphics Referenz auf das Graphics-Objekt zum zeichnen.
     */
    private void draw(Graphics graphics) {
        for (Component component : components.getComponents()) {
            if (component instanceof Figure) {
                Figure figure = (Figure) component;
                figure.draw(graphics);
            }
        }
    }

    public void display() {
        repaint();
    }


}