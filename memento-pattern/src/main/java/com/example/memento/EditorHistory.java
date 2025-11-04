package com.example.memento;

import java.util.Stack;

public class EditorHistory {
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public void saveState(Memento state) {
        undoStack.push(state);
        redoStack.clear();
    }

    public Memento undo(Memento currentState) {
        if (undoStack.isEmpty()) return null;
        redoStack.push(currentState);
        return undoStack.pop();
    }

    public Memento redo(Memento currentState) {
        if (redoStack.isEmpty()) return null;
        undoStack.push(currentState);
        return redoStack.pop();
    }
}
