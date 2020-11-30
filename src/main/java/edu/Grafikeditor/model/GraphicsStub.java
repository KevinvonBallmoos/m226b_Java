package edu.Grafikeditor.model;

import lombok.Getter;

@Getter
public class GraphicsStub extends ConcreteGraphics {

    // Hilfsobjekte, welche zur Überprüfung der Schnittstellen
    // benötigt werden.
    private static int numberOfCalls;
    private int x, y;
    private int width, height;

    public static int getNumberOfCalls() {
        return numberOfCalls;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
   
    @Override
    public void drawRect(int x, int y, int width, int height) {
        numberOfCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
        numberOfCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}