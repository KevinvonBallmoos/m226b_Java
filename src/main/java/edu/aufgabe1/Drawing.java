package edu.aufgabe1;

public class Drawing {
    public static void main(String[] args) throws InterruptedException {

        Display display = new Display();
        MoveFigure moveFigure = new MoveFigure();

        Position rectanglePosition = new Position(200, 200);
        Figure rectangle = new Rectangle(rectanglePosition, 100, 100);

        Position circlePosition = new Position(200, 200);
        Circle circle = new Circle(circlePosition, 50);

        Position start = new Position(400, 300);
        Position end = new Position(500, 100);
        Line line = new Line(start, end);

        display.add(rectangle);
        Thread.sleep(1000);
        display.add(circle);
        Thread.sleep(1000);
        display.add(line);

        Thread.sleep(1000);
        moveFigure.move(rectanglePosition, circlePosition, start, end);
    }
}

