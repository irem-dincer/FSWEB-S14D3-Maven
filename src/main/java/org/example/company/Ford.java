package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders,name);
    }


    @Override
    public void  startEngine(){
        System.out.println("Ford -> the car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    public void accelerate(){
        System.out.println("Ford -> the car is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    public void brake(){
        System.out.println("Ford -> the car is braking");
        System.out.println(getClass().getSimpleName());
    }

}
