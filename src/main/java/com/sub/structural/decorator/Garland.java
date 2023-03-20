package com.sub.structural.decorator;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {

        return super.decorate() + this.decorateWithGarland();
    }

    private String decorateWithGarland() {

        return " with Garland";
    }

}
