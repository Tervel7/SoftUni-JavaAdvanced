package Generics.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(100);
        numbers.add(-1);
        numbers.add(50);

        System.out.println(ListUtils.getMax(numbers));
        System.out.println(ListUtils.getMin(numbers));

        List<String> names = new ArrayList<>();
        names.add("as");
        names.add("asd");
        names.add("asdf");
        names.add("a");
        names.add("asdfl");

        System.out.println(ListUtils.getMax(names));
        System.out.println(ListUtils.getMin(names));
    }
}
