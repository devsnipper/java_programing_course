package chapter2;

// user imput importation of the tool 
import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double speed;
        double distance;
        double hours;
        String make;
        

         
        System.out.println("Please enter the car make:");
        make = input.nextLine();
        System.out.println("please enter the distance to travel in Km");
        distance = input.nextDouble(); 
        System.out.println("please enter the number of hour to travel the distance");
        hours = input.nextDouble();

        speed = distance / hours;
        System.out.println("the speed to travel a distance of "+ distance+" within the time of " +hours+ " is "+speed);
        
        
    }

}
