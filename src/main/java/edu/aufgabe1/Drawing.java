package edu.aufgabe1;

public class Drawing {
    public static void main(String[] args) {
        Display display = new Display();
        Position rectanglePosition = new Position(200, 200);
        Figure rectangle = new Rectangle(rectanglePosition, 100, 100);
        Position circlePosition = new Position(200, 200);
        Circle circle = new Circle(circlePosition, 50);
        Position start = new Position(400, 300);
        Position end = new Position(500, 100);
        Line line = new Line(start, end);
        display.add(rectangle);
        display.add(circle);
        display.add(line);
    }
}

