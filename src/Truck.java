public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private static final double CAPACITY = 20.0;
    private static double totalFuel;

    public Truck (String t){
        truckID=t;
    }
    public Truck (String t, double o, double m, double f){
        truckID=t;
        odometer=o;
        mpg=m;
        fuel=f;
    }
    public String getTruckID(){
        return truckID;
    }
    public double getOdometer(){
        return odometer;
    }
    public double getMpg(){
        return mpg;
    }
    public double getFuel(){
        return fuel;
    }
    public void setMpg(double mpg){
        this.mpg=mpg;
    }
    public boolean enoughFuel(double m){
        if(m<(m/mpg)){
            return true;
        }
        else{
            return false;
        }
    }
    public String drive(double m){
        if(enoughFuel(m)){
            odometer+=m;
            fuel-=(m/mpg);
            return "Success";
        }
        else{
            return "Truck "+truckID+" does not have enough fuel to drive "+m+" miles";
        }
    }
    public void fill(){
        fuel+=(double)CAPACITY-fuel;
        totalFuel+=fuel;
    }
    public String fill(double g){
        if(CAPACITY-fuel<g){
            return "Truck "+truckID+": Gallons exceeds tank capacity";
        }
        else{
            return "Success";
        }
    }
    public static double getTotalFuel(){
        return (int)totalFuel;
    }
    public String toString(){
        return "Truck: "+truckID+"\nOdometer: "+odometer+"\nMiles Per Gallon: "+mpg+"\nFuel: "+fuel;
    }

}
