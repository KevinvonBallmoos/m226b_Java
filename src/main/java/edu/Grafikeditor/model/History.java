package edu.Grafikeditor.model;

import java.util.Stack;

/**
 * #Todo
 * work in progress
 * class History, save all state of composite
 *
 * @author Kevin
 */
public class History {
    private final Stack<EditorState> states = new Stack<>();

    /**
     * #Todo
     * work in progess
     * adds a new state of composite
     *
     * @param state new state of composite
     */
    public void push(EditorState state) {
        states.add(state);
    }

    /**
     * #Todo
     * work in progess
     *
     * @return state.pop() the last element of the History
     */
    public EditorState pop() {
        return states.pop();
    }
}
