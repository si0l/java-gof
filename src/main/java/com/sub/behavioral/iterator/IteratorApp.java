package com.sub.behavioral.iterator;

public class IteratorApp {

    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository();
        Iterator it = nameRepository.getIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
