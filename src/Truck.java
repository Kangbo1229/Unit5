public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private static final double CAPACITY = 20.0;
    private static double totalFuel;

    public Truck (String t){
        truckID = t;
    }
    public Truck (double o, double m, double f){
        odometer = o;
        mpg = m;
        fuel = f;
    }
    public Truck () {
        odometer = 0.0;
        mpg =0.0;
        fuel = 0.0;
    }
}
