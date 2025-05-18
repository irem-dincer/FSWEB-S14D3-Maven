package org.example.arge;

public class HybridCar extends CarSkeleton{
private double  avgKmPerLitre;
private int batterySize;
private int cylinders;

    public HybridCar(String name, String description,double avgKmPerLitre,int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders = cylinders;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }
    public double getAvgKmPerLitre() {
        return this.avgKmPerLitre;
    }
    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }
    public int getBatterySize() {
        return this.batterySize;
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
        return "run from hybrid car";
    }

}
