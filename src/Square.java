public class Square {
    public double calculateArea() {
        double a = side * side;
        return a;
    }
    public String toString(){
        return "Square with side x" + side;
    }
    private double side;
    public Square(double s){
        side = s;
    }
}
