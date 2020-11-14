package edu.Grafikeditor.memento;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("Hallo");
        history.push(editor.createState());

        editor.setContent("Hallo Welt");
        history.push(editor.createState());

        editor.setContent("Hallo Welt Tschüs");

        System.out.println(editor);
        editor.undo(history.pop());

        System.out.println(editor);
        editor.undo(history.pop());
        System.out.println(editor);
    }
}
