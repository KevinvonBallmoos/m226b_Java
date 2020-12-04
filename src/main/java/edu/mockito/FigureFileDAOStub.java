package edu.mockito;

public class FigureFileDAOStub implements FigurDAO {

    private static int count = 0;
    private static final String[] list = {
            "Rectangle 200 200 30 15",
            "Circle 100 100 15",
            "Line 400 300 500 100",
    };

    /**
     * Lesen der nächsten Zeile aus der statischen Liste. Sobald
     * wir das Ende der Liste erreicht haben wird der Wert null
     * zurück gegeben.
     *
     * @return Liste der gelesenen Werte
     */

    @Override
    public String[] readNextFigurData() {
        return (count < list.length) ? list[count++].split("\\s") : null;
    }
}
