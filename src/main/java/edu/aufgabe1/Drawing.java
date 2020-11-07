package edu.aufgabe1;

public class Drawing {
    public static void main(String[] args) throws InterruptedException {

        Display display = new Display();
        Compositum drawing = new Compositum();

        Position rectanglePosition = new Position(200, 200);
        Figure rectangle = new Rectangle(rectanglePosition, 100, 100);

        Position circlePosition = new Position(200, 200);
        Circle circle = new Circle(circlePosition, 50);

        Position start = new Position(400, 300);
        Position end = new Position(500, 100);
        Line line = new Line(start, end);

        drawing.addComponent(rectangle);
        drawing.addComponent(circle);
        drawing.addComponent(line);

        for (int i = 0; i< 100; i++){
            Thread.sleep(50);
            drawing.moveTo(new Position(1,1));
            drawing.repaint();
        }
    }
}

