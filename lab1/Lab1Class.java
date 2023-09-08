import java.lang.Math;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Lab1Class {
    private double a=0.7;
    private double b=0.05;
    private double x=0.5;

    public double calculateR(){
        return (Math.pow(x, 2) * (x + 1)) / b - Math.pow(Math.sin(x + a), 2);
    }

    public double calculateS(){
        return Math.sqrt((x * b) / a) + Math.pow(Math.cos(Math.pow(x + b, 3)), 2);
    }

    public void printCurrentDate(){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Current Date: " + dateFormat.format(currentDate));
    }
}
