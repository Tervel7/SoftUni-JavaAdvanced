package IteratorsAndComparators.SuperMarket;

public class Test {
    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket("Apple", "Orange", "Banana");

        for (String fruit : superMarket) {
            System.out.println(fruit + " ");
        }
    }
}
