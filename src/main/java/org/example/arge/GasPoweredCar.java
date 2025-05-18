package org.example.arge;

public class GasPoweredCar extends  CarSkeleton{

private  double avgKmPerLitre;
private int cylinders;

public GasPoweredCar(String name,String description,double avgKmPerLitre, int cylinders){
    super(name,description);
    this.avgKmPerLitre=avgKmPerLitre;
    this.cylinders=cylinders;
}



    public void setAvgKmPerLitre(double avgKmPerLitre) {

    this.avgKmPerLitre = avgKmPerLitre;
    }
    public double getAvgKmPerLitre() {

    return this.avgKmPerLitre;
    }
    public void setCylinders(int cylinders) {

    this.cylinders = cylinders;
    }
    public int getCylinders() {

    return this.cylinders;
    }

    @Override
    public String startEngine() {

        return getName() + " car starting";
    }

    @Override
    public String drive() {
    return "run from GasPowered car";
    }




}
