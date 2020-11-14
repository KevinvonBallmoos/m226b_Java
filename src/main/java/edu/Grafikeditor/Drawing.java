package edu.Grafikeditor;

import edu.Grafikeditor.controller.Display;
import edu.Grafikeditor.model.*;

public class Drawing {
    public static void main(String[] args) throws InterruptedException {

        Compositum compositum = new Compositum();
        Display display = new Display(compositum);

        Position rectanglePosition = new Position(200, 200);
        Figure rectangle = new Rectangle(rectanglePosition, 100, 100);

        Position circlePosition = new Position(200, 200);
        Circle circle = new Circle(circlePosition, 50);

        Position start = new Position(400, 300);
        Position end = new Position(500, 100);
        Line line = new Line(start, end);

        compositum.add(rectangle);
        compositum.add(circle);
        compositum.add(line);


        display.display();

        for (int i = 0; i < 100; i++) {
            Thread.sleep(50);
            compositum.moveTo(new Position(1, 1));
            display.display();
        }
    }
}

