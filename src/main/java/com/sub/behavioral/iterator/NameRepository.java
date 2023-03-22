package com.sub.behavioral.iterator;

import java.util.NoSuchElementException;

public class NameRepository implements Container {

    private String[] names = { "James", "John", "Jim" };

    @Override
    public Iterator getIterator() {

        return new NameIterator();

    }

    private class NameIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {

            if (hasNext()) {

                return names[index++];
            }

            throw new NoSuchElementException();
        }

    }

}
