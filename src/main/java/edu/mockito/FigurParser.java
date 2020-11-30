package edu.mockito;

import edu.Grafikeditor.model.Circle;
import edu.Grafikeditor.model.Figure;
import edu.Grafikeditor.model.Line;
import edu.Grafikeditor.model.Rectangle;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class FigurParser {


    private final FigureFileDAOStub dao;

    public FigurParser(FigureFileDAOStub dao) {
        this.dao = dao;
    }
    public List<Figure> parse() {
        List<Figure> figuren = new ArrayList<>();
        String[] figurData = dao.readNextFigurData();
        while (figurData != null) {
            String figurTyp = figurData[0];
            int x = Integer.parseInt(figurData[1]);
            int y = Integer.parseInt(figurData[2]);
            switch (figurTyp) {
                case "Rectangle" -> {
                    int breite = Integer.parseInt(figurData[3]);
                    int hoehe = Integer.parseInt(figurData[4]);
                    figuren.add(new Rectangle(x, y, hoehe, breite));
                }
                case "Circle" -> {
                    int radius = Integer.parseInt(figurData[3]);
                    figuren.add(new Circle(x, y, radius));
                }
                case "Line" -> {
                    int endx = Integer.parseInt(figurData[3]);
                    int endy = Integer.parseInt(figurData[4]);
                    figuren.add(new Line(x, y, endx, endy));
                }
            }
            figurData = dao.readNextFigurData();
        }
        return figuren;

    }

}
