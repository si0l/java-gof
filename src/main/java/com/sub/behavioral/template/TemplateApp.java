package com.sub.behavioral.template;

public class TemplateApp {
 
    public static void main(String[] args) {
        
        Game g1 = new Chess();
        g1.play();

        Game g2 = new Soccer();
        g2.play();

    }

}
