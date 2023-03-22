package com.sub.behavioral.memento;

import java.util.Stack;

//care taker
public class History {

    private Stack<EditorState> states = new Stack<>();

    public void save(EditorState state) {

        states.push(state);

    }

    public void revert(Editor editor) {

        if (!states.isEmpty()) {
            editor.restoreState(states.pop());
        } else {
            System.out.println("Initial state reached");
        }

    }

}
