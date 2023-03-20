package com.sub.structural.decorator;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {

        return super.decorate() + this.decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {

        return " with Bubble Lights";
    }

}
