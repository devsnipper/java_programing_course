package csc_2301programs.midterm_exam;
import java.util.Scanner;
public class circuitboardprofit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double retailprice;
        Double profit;
        System.out.println("what is the price of the retail price of the circuit board");
        retailprice = input.nextDouble();

        profit= retailprice*0.4;

        System.out.println("the profit earned for that product is  "+profit);

    }

}
