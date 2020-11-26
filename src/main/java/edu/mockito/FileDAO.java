package edu.mockito;

import javax.swing.*;
import java.io.*;

/**
 * Data Access Object
 * <p>
 * Klasse für das Einlesen von Daten aus einer Textdatei (CSV)
 */
@SuppressWarnings("unused")
public class FileDAO  implements DAO, AutoCloseable {

    private BufferedReader in;

    public FileDAO() {
        JFileChooser chooser = new JFileChooser();
        int openResult = chooser.showOpenDialog(null);
        if (openResult == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                in = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Lesen der nächsten Zeile aus der  Textdatei (CSV).
     *
     * @return Liste der gelesenen Werte
     */

    @Override
    public String[] readNextLine() {
        if (in != null) {
            try {
                String line = in.readLine();
                if (line != null && !line.isEmpty())
                    return line.split(",");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Schliessen der benötigten Resourcen.
     */
    @Override
    public void close() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
