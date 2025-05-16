package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name){
        super(cylinders,name);
    }

    @Override
    public void  startEngine(){
        System.out.println("Holden -> the car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    public void accelerate(){
        System.out.println("Holden -> the car is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    public void brake(){
        System.out.println("Holden -> the car is braking");
        System.out.println(getClass().getSimpleName());
    }


}
