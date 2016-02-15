///////////////////////////////////////////////////////////////
//Wesley Osborne
//lab 03
//Convert Java Program
//2/11/16
//
//Program that accepts user input for meters and converts it into inches

//Import scanner to accept user input
import java.util.Scanner;

//Define class
public class Convert {
    
    //Main method
    public static void main(String[] args) {
    
    //create scanner to accept user input
    Scanner input = new Scanner( System.in );
    
    //Prompt user to enter a value for meters
    System.out.println("Enter the distance in meters: ");
    
    //Calculations to convert meters to inches & print output
    double metersInput = input.nextDouble();
    double inchesPerMeter = 39.3701;
    double meterToinches = metersInput * inchesPerMeter;
    System.out.printf(metersInput +" meters is "+ (double) Math.floor(meterToinches * 1e4)/1e4 +" inches." );
    
    
    }// end of main method 
} //end of class

