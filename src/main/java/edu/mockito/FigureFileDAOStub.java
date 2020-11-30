package edu.mockito;

import edu.Grafikeditor.model.Figure;

public class FigureFileDAOStub implements FigurDAO{

    @Override
    public String[] readNextFigurData() {
        return new String[0];
    }
}
