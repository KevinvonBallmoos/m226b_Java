package edu.Grafikeditor;

import edu.Grafikeditor.controller.Display;
import edu.Grafikeditor.model.*;
import edu.Grafikeditor.model.Rectangle;

import java.awt.*;

public class Drawing {
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

        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            compositum.moveTo(new Position(1, 1));
            history.push(compositum.createState());

            for (int j = 0; j < 1; j++){
                compositum.undo(history.pop());
                display.display();
            }
            display.display();


        }

    }
}

