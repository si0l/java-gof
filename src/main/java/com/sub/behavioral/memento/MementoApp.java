package com.sub.behavioral.memento;

public class MementoApp {

    public static void main(String[] args) {

        var editor = new Editor();
        var history = new History();

        editor.setContent("I'll");
        history.save(editor.createState());
        editor.setContent("I'll be");
        history.save(editor.createState());
        editor.setContent("I'll be back");
        history.save(editor.createState());

        history.revert(editor);
        System.out.println(editor.getContent());
        history.revert(editor);
        System.out.println(editor.getContent());
        history.revert(editor);
        System.out.println(editor.getContent());
        history.revert(editor);
    
    }

}
