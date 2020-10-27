package edu.aufgabe1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse Display stellt ein Fenster auf dem Bildschirm zur Verfügung, in welchem
 * Figur-Objekte dargestellt werden können.
 * Siehe auch Java-Grundkurs Abschnitt 10.2 und 10.3.
 *
 * @author Andres Scheidegger
 */
public class Display extends JFrame {

    /**
     * Die Liste der dargestellten Figur-Objekte
     */
    private final List<Figure> figures = new ArrayList<>();

    /**
     * Konstruktor. Initialisiert das Fenster in der Mitte des Bildschirms und erzeugt ein
     * JFrame-Objekt, auf welchem die Figuren gezeichnet werden.
     */
    public Display() {
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
        // Siehe Java-Grundkurs Abschnitt 3.9
        add(new JPanel() {
            // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
            // Methode beim Dsiplay aufruft.
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
        for (Figure figure : figures) {
            if (figure instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) figure;
                g.drawRect(
                        rectangle.getPosition().getX(),
                        rectangle.getPosition().getY(),
                        rectangle.getWidth(), rectangle.getHeight());

            }
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                int radius = circle.getRadius();
                int diameter = radius * 2;
                g.drawOval(
                        circle.getPosition().getX() - radius,
                        circle.getPosition().getY() - radius,
                        diameter, diameter);

            }
            if (figure instanceof Line) {
                Line line = (Line) figure;
                g.drawLine(line.getPosition().getX(), line.getPosition().getY(),
                        line.getEnd().getX(), line.getEnd().getY());
            }
        }
    }

    /**
     * Fügt eine weitere Figur hinzu und löst die Auffrischung des Fensterinhaltes aus.
     *
     * @param figur Referenz auf das weitere Figur-Objekt.
     */
    public void add(Figure figur) {
        figures.add(figur);
        repaint();
    }

    /**
     * Löscht alle Figuren und löst die Auffrischung des Fensterinhaltes aus.
     */
    @SuppressWarnings("unused")
    public void clear() {
        figures.clear();
        repaint();
    }

}
