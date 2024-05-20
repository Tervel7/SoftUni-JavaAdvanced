package ExamPrep.dealership;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("BMW","320i",2007);
        Car c2 = new Car("BMW","328i",2007);
        Car c3 = new Car("Mercedez","C220",2007);
        Car c4 = new Car("Audi","A3",2007);

        c1.setYear(2008);

        Dealership vipCars = new Dealership("vipCars",4);
        vipCars.add(c1);
        vipCars.add(c2);
        vipCars.add(c3);
        vipCars.add(c4);

        System.out.println(vipCars.buy("BMW","328i"));
        System.out.println(vipCars.buy("Audi","A4"));

        Car latestCar = vipCars.getLatestCar();
        System.out.println(latestCar.toString());

        Car getMyCar = vipCars.getCar("Audi","A3");
        System.out.println(getMyCar.toString());

        System.out.println(vipCars.getStatistics());
    }
}
