public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;
    public CarTrip (double a, double b, double c, double d){
        myStartOdometer = a;
        myEndOdometer = b;
        myTime = c;
        myGallonsUsed = d;
    }
    public CarTrip () {
        myStartOdometer = 0.0;
        myEndOdometer = 0.0;
        myTime = 0.0;
        myGallonsUsed = 0.0;

    }
    public double getMyStartOdometer(){
        return myStartOdometer;
    }
    public double getMyEndOdometer(){
        return myEndOdometer;
    }
    public double getMyTime(){
        return myTime;
    }
    public double getMyGallonsUsed(){
        return myGallonsUsed;
    }
    public double getTripDistance() {
        return Math.abs(myStartOdometer - myEndOdometer);
    }
    public double getAverageSpeed() {
        return Math.abs((getTripDistance()/myTime));
    }
    public double getGasMileage() {
        return Math.abs((getTripDistance()/myGallonsUsed));
    }
    public double getTotalGasPrice(double perGallon) {
        return Math.abs((getTripDistance()/perGallon)*myGallonsUsed);

    }
    public String toString(){
        return "Distance traveled: "+getTripDistance()+"miles";

    }




}
