package edu.Grafikeditor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
        this.setPosition(start);
        this.end = end;
    }
    public Line(int x, int y, int endX, int endY){
        this(new Position(x,y), new Position(endX, endY));
    }

    @Override
    public void moveTo(Position position) {
        this.getPosition().add(position);
        end.add(position);
    }

    /**
     * Zeichnet eine Figur auf dem Display.
     */
    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(this.getPosition().getX(),
                this.getPosition().getY(),
                this.getEnd().getX(),
                this.getEnd().getY());
    }

}
