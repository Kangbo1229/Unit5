import java.util.Scanner;

public class Student{
    private String Name;
    private double Test1;
    private double Test2;


    public Student(String studentName){
        Name = studentName;
        Test1 = 0;
        Test2 = 0;

    }

    public void inputGrades(){
        Scanner scan = new Scanner(System.in);
        System.out.println(Name+"'s Test1 Score");
        Test1 = scan.nextInt();
        System.out.println(Name+"'s Test2 Score");
        Test2 = scan.nextInt();

    }

    public double getAverage(){
        return ((Test1+Test2)/2);
    }

    public String getName() {
        return Name;
    }

    public String toString(){
        return "Name: "+Name+" Test1: "+Test1+" Test2: "+Test2;
    }


}
