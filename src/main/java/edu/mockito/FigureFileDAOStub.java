package edu.mockito;

import edu.Grafikeditor.model.Figure;

public class FigureFileDAOStub implements FigurDAO{

    @Override
    public Figure[] readNextFigurData() {
        return new Figure[0];
    }
}
