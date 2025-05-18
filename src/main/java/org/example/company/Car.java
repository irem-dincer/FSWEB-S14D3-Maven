package org.example.company;

import java.util.Objects;

public class Car {
private  boolean engine;
private  int cylinders;
private  String name;
private int wheels ;

public Car(int cylinders, String name){
    this.cylinders=cylinders;
    this.name=name;
    this.engine=true;
    this.wheels=4;
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

    public String  startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
       return "the car's engine is starting";
}
public String accelerate(){
    System.out.println("Class Name: " + getClass().getSimpleName());
   return  "the car is accelerating";

}
public String brake(){
    System.out.println("Class Name: " + getClass().getSimpleName());
    return "the car is braking";

}
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

}
