package Generics.Scale;

public class Test {
    public static void main(String[] args) {

        Scale<Integer> scaleIntegers = new Scale(2,10);
        System.out.println(scaleIntegers.getHeavier());

        Scale<String> scaleStrings = new Scale<>("test","tes");
        System.out.println(scaleStrings.getHeavier());

        Scale<Float> scaleFloats = new Scale<>((float)12.56,(float)12.34);
        System.out.println(scaleFloats.getHeavier());

    }
}
