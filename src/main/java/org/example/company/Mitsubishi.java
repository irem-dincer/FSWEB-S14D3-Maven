package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name){
        super(cylinders,name);
    }

    @Override
    public void  startEngine(){
        System.out.println("Mitsubishi -> the car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    public void accelerate(){
        System.out.println("Mitsubishi -> the car is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    public void brake(){
        System.out.println("Mitsubishi -> the car is braking");
        System.out.println(getClass().getSimpleName());
    }

}
