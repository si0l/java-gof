package com.sub.structural.decorator;

public class DecoratorApp {
    
    public static void main(String[] args) {
    
        ChristmasTree tree = new Garland(new ChristmasTreeImpl());
        ChristmasTree tree2 = new BubbleLights(new Garland(new BubbleLights(new ChristmasTreeImpl())));

        System.out.println(tree.decorate());

        System.out.println(tree2.decorate());

    }

}
