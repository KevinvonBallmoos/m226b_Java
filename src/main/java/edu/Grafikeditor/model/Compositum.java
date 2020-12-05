package edu.Grafikeditor.model;

import java.awt.*;


/**
 * class Compositum
 * extends Container
 *
 * @author Kevin
 */
public class Compositum extends Container {

    /**
     * moveTo method to call the specific moveTo method in circle, line or rectangle
     *
     * @param position is required to move the figure to another position
     */
    public void moveTo(Position position) {
        for (Component component : this.getComponents()) {
            Figure figure = (Figure) component;
            figure.moveTo(position);
        }
    }

    @Override
    public Compositum clone(){
        Compositum clone = new Compositum();
        for (int i = 0; i < getComponents().length; i++){
            Component component = getComponents()[i];
            clone.add((Component) ((Figure) component).clone());
        }
        return clone;
    }

}
