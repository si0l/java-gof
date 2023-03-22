package com.sub.behavioral.command;

public class TextFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {

        return "opened file: " + name;
    }

    public String save() {

        return "saved file: " + name;
    }
}
