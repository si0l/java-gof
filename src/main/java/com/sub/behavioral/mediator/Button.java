package com.sub.behavioral.mediator;

public class Button {

    private Mediator mediator = new Mediator();

    public void press() {

        mediator.press();

    }

}
