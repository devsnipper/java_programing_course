package chapter2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        double height ;
        System.out.println("what is your weight");
        weight = input.nextDouble();
        System.out.println("what is your height");
        height = input.nextDouble();

        Double BMI= weight/ (height*height);

        System.out.println("your BMI is "+ BMI);

        if (BMI<18.5) {
            System.out.println("you are Underweight");
            
        }

        else if (BMI<24.9) {
            System.out.println("you are healthy");
            
        }

        else if (BMI>24.9) {
            System.err.println("you are Overweight");
            
        }
        

        
    }

}
