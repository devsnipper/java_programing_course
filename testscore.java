package chapter2;
import java.util.Scanner;
public class testscore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double score_1;
        Double score_2;
        Double score_3;
        Double average;

        System.out.println("enter your score 1");
        score_1= input.nextDouble();
        System.out.println("enter your score 2");
        score_2 =input.nextDouble();
        System.out.println("enter your score 3");
        score_3= input.nextDouble();

        average= (score_1+score_2+score_3)/3;

        if (average>=90) {
            System.err.println("your grade is A");
            
        }

        else if (average>=80 && average<90) {
            System.out.println("your grade is B");
            
        }
        else if (average >= 70 && average<80) {
            System.out.println("your grade is c");
            
        }
        else if (average>=60 && average<70) {
            System.out.println("your grade is D");
            
        }
        else if (average < 60) {
            System.out.println("your grade is F");
            
        }


    }
    
}
