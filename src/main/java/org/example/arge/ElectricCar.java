package org.example.arge;

public class ElectricCar extends CarSkeleton{

private  double avgKmPerCharge;
private int batterySize;

public ElectricCar(double avgKmPerCharge,int batterySize,String name,String description){
    super(name,description);
    this.avgKmPerCharge=avgKmPerCharge;
    this.batterySize=batterySize;
}

    public ElectricCar(String avgKmPerCharge, String batterySize, double name, double description) { //I added it for mainTest
        super(String.valueOf(name), String.valueOf(description));
        try {
            this.avgKmPerCharge = Double.parseDouble(avgKmPerCharge);
            this.batterySize = Integer.parseInt(batterySize);
        }  catch (NumberFormatException e) {
            System.out.println("Error converting string to number. Using default values.");
    }
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public double getAvgKmPerCharge() {
        return this.avgKmPerCharge;
    }
    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }
    public int getBatterySize() {
        return this.batterySize;
    }

    @Override
    public String startEngine() {
       return getName() + " car starting";
    }

    @Override
    public String drive() {
       return "run from electric car";
    }


}
