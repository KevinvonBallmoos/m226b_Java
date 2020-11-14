package edu.Grafikeditor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.swing.*;
import java.awt.*;

@Data
@EqualsAndHashCode(callSuper = true)
public class Line extends Figure {
    /**
     * Endposition der Linie auf dem Display.
     */
    private Position end;

    /**
     * Erstellen einer neuen Linie. Die Position [x,y] entspricht der
     * Startposition der Linie auf dem Display.
     *
     * @param start Startposition der Linie auf dem Display
     * @param end   Endposition der Linie auf dem Display
     */
    public Line(Position start, Position end) {
        this.setPosition(start)
        this.end = end;
    }

    /**
     * Zeichnet eine Figur auf dem Display.
     */

    @Override
    public void moveTo(Position position) {

    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(this.getPosition().getX(),
                this.getPosition().getY(),
                this.getEnd().getX(),
                this.getEnd().getY());
    }

}

