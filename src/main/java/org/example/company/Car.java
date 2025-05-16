package org.example.company;

public class Car {
private  boolean engine;
private  int cylinders;
private  String name;
private int wheels ;

public Car(int cylinders, String name){
    this.cylinders=cylinders;
    this.name=name;
    this.engine=false;
    this.wheels=10;
}
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }
    public boolean getEngine(){
    return this.engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void  startEngine(){
    System.out.println("the car's engine is starting");
        System.out.println(getClass().getSimpleName());
}
public void accelerate(){
    System.out.println("the car is accelerating");
    System.out.println(getClass().getSimpleName());
}
public void brake(){
    System.out.println("the car is braking");
    System.out.println(getClass().getSimpleName());
}

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        return cylinders == car.cylinders &&
                (name == null ? car.name == null : name.equals(car.name));
    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cylinders;
        return result;
    }

}
