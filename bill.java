package chapter2;
import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double charge;

        System.out.println("what is your charge? ");
        charge= input.nextDouble();

        Double tax;
        tax= (6.75*charge) /100;
        Double tips;
        tips= (20*charge)/100;

        Double total_bill;
        total_bill = (tax + tips+charge );

        System.out.println("the meal charge is " + charge);
        System.out.println("the tax is "+ tax);
        System.out.println("the tips is " + tips);
        System.out.println("the total bill is "+ total_bill);
        

        
    }
    
}
