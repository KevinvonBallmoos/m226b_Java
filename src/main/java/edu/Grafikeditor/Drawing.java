package edu.Grafikeditor;

import edu.Grafikeditor.controller.Display;
import edu.Grafikeditor.model.*;
import edu.Grafikeditor.model.Rectangle;

import java.awt.*;

/**
 * main Class, program starts here
 *
 * @author Kevin
 */
public class Drawing {
    /**
     * first position of rectangle, circle and line gets defined
     * than they move to another position
     * undo function returns figures to the first location
     *
     * @param args String
     * @throws InterruptedException Thread.sleep(), to see the figure move
     */
    public static void main(String[] args) throws InterruptedException {

        Compositum compositum = new Compositum();
        Display display = new Display(compositum);
        History history = new History();

        Position rectanglePosition = new Position(200, 200);
        Figure rectangle = new Rectangle(rectanglePosition, 100, 100);

        Position circlePosition = new Position(200, 200);
        Circle circle = new Circle(circlePosition, 50);

        Position start = new Position(400, 300);
        Position end = new Position(500, 100);
        Line line = new Line(start, end);

        compositum.add(rectangle);
        history.push(compositum.createState());
        compositum.add(circle);
        history.push(compositum.createState());
        compositum.add(line);
        history.push(compositum.createState());


        display.display();

        for (int i = 0; i < 50; i++) {
            Thread.sleep(50);
            compositum.moveTo(new Position(1, 1));

            history.push(compositum.createState());
            display.display();
        }
        for (int j = 0; j < 20; j++) {
            Thread.sleep(50);
            compositum.undo(history.pop());
            display.display();
        }

    }

}


