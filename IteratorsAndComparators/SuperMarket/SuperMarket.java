package IteratorsAndComparators.SuperMarket;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SuperMarket implements Iterable<String> {

    private List<String> fruits;

    SuperMarket(String... fruits) {
        this.fruits = Arrays.asList(fruits);
    }

    @Override
    public Iterator<String> iterator() {
        return new ShopAssistant();
    }

    private class ShopAssistant implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index<fruits.size();
        }

        @Override
        public String next() {
            return fruits.get(index++);
        }
    }
}
