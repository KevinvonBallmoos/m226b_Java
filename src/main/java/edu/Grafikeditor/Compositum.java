package edu.Grafikeditor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Compositum extends Component {

    /**
     * Die Liste der dargestellten Figur-Objekte
     */


    public void moveTo(Position position) {
        for (Component component : this.getComponents()) {
            Figure figure = (figure) component;
            figure.moveTo(position);
        }
    }

}
