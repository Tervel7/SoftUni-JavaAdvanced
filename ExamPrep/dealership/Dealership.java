package ExamPrep.dealership;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private int capacity;
    ArrayList<Car> cars;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        if(cars.size()<capacity)
            cars.add(car);
    }

    public boolean buy(String manufacturer, String model) {
        for (int i = 0; i < this.cars.size(); i++) {
            if(this.cars.get(i).getManufacturer().equals(manufacturer) && this.cars.get(i).getModel().equals(model)){
                this.cars.remove(this.cars.get(i));
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        if(this.cars.isEmpty())
            return null;

        Car latestCar = this.cars.getFirst();
        for (Car car : this.cars) {
            if (car.getYear()>latestCar.getYear())
                latestCar = car;
        }

        return latestCar;
    }

    public Car getCar(String manufacturer, String model) {
        for (Car car:this.cars){
            if(car.getManufacturer().equals(manufacturer)&&car.getModel().equals(model))
                return car;
        }
        return null;
    }

    public int getCars() {
        return this.cars.size();
    }

    public String getStatistics() {
        StringBuilder s = new StringBuilder();
        s.append("The cars are in a car dealership " + this.name + ":\n");
        for (Car car:this.cars){
            s.append(car.toString() + "\n");
        }
        return s.toString();
    }

}
