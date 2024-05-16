package Generics.ArrayCreator;

public class Test {
    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        ArrayCreator.<String>create(String.class, 5, "text");
        ArrayCreator.create(4, 21);
    }
}
