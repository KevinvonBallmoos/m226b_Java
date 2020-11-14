package edu.Grafikeditor;

import lombok.Data;
import lombok.EqualsAndHashCode
import java.awt.*;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class Figure extends Container{
    /**
     * Position der Figur(en) auf dem Display
     */
    private  Position position;


    /**
     * Zeichnet eine Figur auf dem Display.
     */
    public abstract void draw(Graphics graphics);

}

