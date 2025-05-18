package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(String name,String description){
        this.name=name;
        this.description=description;
    }
    public  CarSkeleton(){
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {

        return this.name;
    }
    public void setDescription(String description) {

        this.description = description;
    }
    public String getDescription() {

        return this.description;
    }

    public String startEngine(){

        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + " is starting engine.";

    }
    public  String drive(){

       runEngine();// First the engine is started
       return getName()+ " is driving...";
    }
  protected void runEngine() {
       System.out.println("Engine is running");

   }


}
