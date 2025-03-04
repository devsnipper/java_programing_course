package csc_2301programs.midterm_exam;

import java.util.Scanner;

public class timecalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int number_of_second;
         double minute;
         double hour;
         double day;
         System.out.println("enter a number of second");
         number_of_second= input.nextInt();

         if (number_of_second>=60 &&number_of_second>3600  ){
            minute=number_of_second/60;
            System.out.println("for "+number_of_second+" second"+" the number of minutes is "+minute);

         }
         else if (number_of_second>=3600 && number_of_second>86400){
            hour = number_of_second/3600;
            System.out.println("for "+number_of_second+" second"+"the number of hours is "+hour);

         }
         else if(number_of_second==86400 || number_of_second>86400){
            day=number_of_second/86400;
            System.out.println("for "+number_of_second+" second "+"the number of day is"+day);
         }

        
    }
}
