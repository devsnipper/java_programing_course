package chapter1;

import java.util.Scanner;

public class shanyroom2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int charge;
        int chc;
        System.out.println("1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch");
        choice=input.nextInt();

        if(choice == 1){
            charge= 125;
            System.out.println("the price of the room is "+charge);

        }

        else if (choice == 2){
            charge= 139;
            System.out.println("the price of the room is "+charge);
        }

        else if (choice == 3){
            charge = 139;
            System.out.println("the price of the room is "+charge);
        }

        else {
            System.err.println("error");
            charge =0;
            System.out.println(charge);
        }

        System.out.println("(1) lake view or a (2) park view");
        chc=input.nextInt();

        if (charge == 1 || charge==2 || charge == 3){
            
            if (chc == 1  ){
                charge= charge+15;
                System.err.println("the new price for the room and the view lake is "+charge);
            }
    
            else if (chc==2 ){
                System.out.println("the price of the room is stil "+ charge );
            }

        }

        

    }
    
}
