package edu.aufgabe1;

public class MoveFigure {

    public void move(Position rectanglePosition, Position circlePosition, Position start, Position end) throws InterruptedException {

        rectanglePosition = new Position(200 +50, 200);
        circlePosition = new Position(200 + 50, 200);
        start = new Position(400 + 50, 300);
        end = new Position(500 + 50, 100);
    }
}
