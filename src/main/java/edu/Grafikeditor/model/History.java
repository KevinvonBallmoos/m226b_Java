package edu.Grafikeditor.model;

import java.util.Stack;

public class History {
    private final Stack<CompositumState> states = new Stack<>();

    /**
     * Hinzufügen eines neuen Compsitum-Zustandes.
     *
     * @param state neuer Zustand des Compositums
     */
    public void push(CompositumState state) {
        states.add(state);
    }

    /**
     * Liefert das letzte Element und löscht es gleichzeitig aus
     * der <i>History</i>.
     *
     * @return liefert das letzte Element der <i>History</i>
     */
    public CompositumState pop() {
        return states.pop();
    }
}
