package edu.Grafikeditor.model;

import java.awt.*;


public class Compositum extends Container {

    /**
     * Die Liste der dargestellten Figur-Objekte
     */


    public void moveTo(Position position) {
        for (Component component : this.getComponents()) {
            Figure figure = (Figure) component;
            figure.moveTo(position);
        }
    }

}
