package DefiningClasses.SmartArray;

public class Test {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();

        smartArray.add(1);
        smartArray.add(3);
        smartArray.add(4);

        smartArray.add(1,2);

        smartArray.remove(3);

        int n = smartArray.get(0);

        for (int i=0; i<30; i++)
            smartArray.add(i);

        for (int i=0; i<20; i++)
            smartArray.remove(0);

        smartArray.forEach(i -> System.out.print(i + " "));

        SmartArray smrtarr = new SmartArray();
        smrtarr.add(1);
        smrtarr.add(2);
        smrtarr.add(3);
        smrtarr.add(4);
        smrtarr.add(1, 12);

    }
}
