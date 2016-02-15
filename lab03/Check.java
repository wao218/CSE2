///////////////////////////////////////////////////////////////
//Wesley Osborne
//lab 03
//Check Java Program
//2/11/16
//
//program that uses the Scanner class to obtain from the user the original cost of the check, 
//the percentage tip they wish to pay, and the number of ways the check will be split. 
//Then determine how much each person in the group needs to spend in order to pay the check.

//imports scanner to accept user input
import java.util.Scanner;

//Define Class
public class Check {
    //Main method
    public static void main(String[] args) {
        
        //creates scanner to accepts user input
        Scanner myScanner = new Scanner( System.in );
        
        //Prompt user for the orignal cost of the check
        System.out.println("Enter the original cost of the check in the form xx.xx: ");
        
        //Accept user input for cost of check
        double checkCost = myScanner.nextDouble();
        
        //Prompt user for the tip percentage they wish to pay and accept the input
        System.out.println("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100; //we want to covert the percentatge into a decimal value
        
        //Prompt the user for # of people that went to dinner & accept the input
        System.out.println("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        //Print out the output
        double totalCost; //total cost of bill
        double costPerPerson; //cost per person
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for storing digits to the right of the decimal pt. for the cost$
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction
        dollars = (int)costPerPerson;
        //get dimes amount, e.g.,
        // (int)(6.73 *10) % 10 -> 7
        // where the % (mod) operator returns the remainder
        // after the divison: 583%100 -> 83, 27%5 -> 2
        dimes = (int)(costPerPerson * 10) % 10;
        pennies = (int)(costPerPerson *100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
        
        
    } //end of main method
    
} //end of class
