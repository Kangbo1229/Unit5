import java.util.Scanner;
public class SquareDriver {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        double i = scan.nextDouble();
        Square a = new Square (i);
        System.out.println(a.calculateArea());
    }


}
