package OOPS;

public class Dealership {
    private Car [] cars;

    public Dealership(Car [] cars){
        this.cars = new Car[cars.length];

        for(int i=0;i<cars.length;i++){
            this.cars[i] = new Car(cars[i]);
        }
    }

    public Car getCar(int index){
        Car car = new Car(this.cars[index]);
        return car;
    }

    public void setCar(int index, Car newCar){
        Car car = new Car(newCar);
        this.cars[index] = car;
    }

}
