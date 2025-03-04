/*Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges
$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a
dozen. Write a program that prompts a user for the number of eggs in the
order and then display the amount owed with a full explanation. For example,
typical output might be, You ordered 27 eggs. That’s 2 dozen at $3.25 per
dozen and 3 loose eggs at 45 cents each for a total of $7.85. Save the program
as Eggs.java
 */


package chapter1;
import java.util.Scanner;
public class egs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eggs_total;
        int egg;
        int eggs_total2;
        double total_2;
        double charges;

        System.err.println("the price of dozen of eggs is 30.25$ or 45$ for individual eggs");
        System.out.println("how much do you want?");
        egg = input.nextInt();

        eggs_total= (egg/12);
        eggs_total2= (egg%12);
        if (eggs_total2 == 0){
            charges= eggs_total *3.25;
            System.out.println("the charge is "+charges);

        }

        else if(eggs_total2 >0){
            charges= (eggs_total *3.25)+(eggs_total2 *0.45);
            System.out.println("the charge is "+ charges);

        }
        


        ;
    }
    
}
