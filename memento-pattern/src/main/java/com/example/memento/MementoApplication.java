package com.example.memento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MementoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MementoApplication.class, args);

        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        editor.setText("Hello");
        history.saveState(editor.save());

        editor.setText("Hello, World!");
        history.saveState(editor.save());

        editor.setText("Hello, World! Welcome!");
        System.out.println("Current: " + editor.getText());

        Memento previousState = history.undo(editor.save());
        if (previousState != null) {
            editor.restore(previousState);
            System.out.println("After undo: " + editor.getText());
        }

        Memento redoState = history.redo(editor.save());
        if (redoState != null) {
            editor.restore(redoState);
            System.out.println("After redo: " + editor.getText());
        }
    }
}
