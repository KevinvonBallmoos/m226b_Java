package edu.mockito;

public class FileDAOStub implements DAO {
    private static int count = 0;
    private static final String[] list = {
            "Kevin,vonBallmoos,1",
            "Peter,Müller,2",
            "Hans,Muster,3",
    };

    /**
     * Lesen der nächsten Zeile aus der statischen Liste. Sobald
     * wir das Ende der Liste erreicht haben wird der Wert null
     * zurück gegeben.
     *
     * @return Liste der gelesenen Werte
     */

    @Override
    public String[] readNextLine() {
        return (count < list.length) ? list[count++].split(",") : null;
    }
}

