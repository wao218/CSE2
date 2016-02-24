///////////////////////////////////////////////////////////////
//Wesley Osborne
//hw04
//ToHex Java Program
//2/22/16
//
//a program which takes decimal RGB values (three inputs) 
//and convert them to hexadecimal.

//Import Scanner 
import java.util.Scanner;

//Class
public class ToHex {
    
    //Main method
    public static void main(String[] args) {
    
    //Create Scanner to accept user input 
    Scanner input = new Scanner( System.in );
    
    //Prompt user to enter 3 digits (integers)
    System.out.println("Please enter three numbers representing RGB values: ");
    
    //Check to see if inputs are integers
    boolean Red = input.hasNextInt(); 
    
    if ( input.hasNextInt() ) {
        int R = input.nextInt();
        boolean Green = input.hasNextInt();
    
    if ( input.hasNextInt() ) {
        int G = input.nextInt();
        boolean Blue = input.hasNextInt();
            
    if ( input.hasNextInt() ) {
       int B = input.nextInt();
    
    //Checks to see if inputs are within range , then converts to hexadecimal 
    if( R <= 255 && R >= 0 && G <= 255 && G >= 0 && B <= 255 && B >= 0 )   {
      
      //Conversion of integers into hexadecimal
      int hexRed = R/16;
      int hexRed1 = R%16;
      int hexGreen = G/16;
      int hexGreen1 = G%16;
      int hexBlue = B/16;
      int hexBlue1 = B%16;
      
      //String variables to hold hexadecimal values 
      String Conversion = "";
      String hex = "";
      String hex1 = "";
      String hex2= "";
      String hex3 = "";
      String hex4 = "";
      String hex5 = "";
      
      //Checks the value of input after conversion and assigns hexadecimal value to it 
      switch( hexRed ) {
          case 0: 
          hex = "0";
          break;
          case 1: 
          hex = "1";
          break;
          case 2: 
          hex = "2";
          break;
          case 3: 
          hex = "3";
          break;
          case 4: 
          hex = "4";
          break;
          case 5: 
          hex = "5";
          break;
          case 6: 
          hex = "6";
          break;
          case 7: 
          hex = "7";
          break;
          case 8: 
          hex = "8";
          break;
          case 9: 
          hex = "9";
          break;
          case 10: 
          hex = "A";
          break;
          case 11: 
          hex = "B";
          break;
          case 12: 
          hex = "C";
          break;
          case 13: 
          hex = "D";
          break;
          case 14: 
          hex = "E";
          break;
          case 15: 
          hex = "F";
          break;
          
          
      }// end of Switch
      
      //Checks the value of input after conversion and assigns hexadecimal value to it
        switch( hexRed1 ) {
          case 0: 
          hex1 = "0";
          break;
          case 1: 
          hex1 = "1";
          break;
          case 2: 
          hex1 = "2";
          break;
          case 3: 
          hex1 = "3";
          break;
          case 4: 
          hex1 = "4";
          break;
          case 5: 
          hex1 = "5";
          break;
          case 6: 
          hex1 = "6";
          break;
          case 7: 
          hex1 = "7";
          break;
          case 8: 
          hex1 = "8";
          break;
          case 9: 
          hex1 = "9";
          break;
          case 10: 
          hex1 = "A";
          break;
          case 11: 
          hex1 = "B";
          break;
          case 12: 
          hex1 = "C";
          break;
          case 13: 
          hex1 = "D";
          break;
          case 14: 
          hex1 = "E";
          break;
          case 15: 
          hex1 = "F";
          break;
          
          
      }// end of Switch
      
      //Checks the value of input after conversion and assigns hexadecimal value to it
        switch( hexGreen ) {
          case 0: 
          hex2 = "0";
          break;
          case 1: 
          hex2 = "1";
          break;
          case 2: 
          hex2 = "2";
          break;
          case 3: 
          hex2 = "3";
          break;
          case 4: 
          hex2 = "4";
          break;
          case 5: 
          hex2 = "5";
          break;
          case 6: 
          hex2 = "6";
          break;
          case 7: 
          hex2 = "7";
          break;
          case 8: 
          hex2 = "8";
          break;
          case 9: 
          hex2 = "9";
          break;
          case 10: 
          hex2 = "A";
          break;
          case 11: 
          hex2 = "B";
          break;
          case 12: 
          hex2 = "C";
          break;
          case 13: 
          hex2 = "D";
          break;
          case 14: 
          hex2 = "E";
          break;
          case 15: 
          hex2 = "F";
          break;
          
          
      }// end of Switch
      
      //Checks the value of input after conversion and assigns hexadecimal value to it
        switch( hexGreen1) {
          case 0: 
          hex3 = "0";
          break;
          case 1: 
          hex3 = "1";
          break;
          case 2: 
          hex3 = "2";
          break;
          case 3: 
          hex3 = "3";
          break;
          case 4: 
          hex3 = "4";
          break;
          case 5: 
          hex3 = "5";
          break;
          case 6: 
          hex3 = "6";
          break;
          case 7: 
          hex3 = "7";
          break;
          case 8: 
          hex3 = "8";
          break;
          case 9: 
          hex3 = "9";
          break;
          case 10: 
          hex3 = "A";
          break;
          case 11: 
          hex3 = "B";
          break;
          case 12: 
          hex3 = "C";
          break;
          case 13: 
          hex3 = "D";
          break;
          case 14: 
          hex3 = "E";
          break;
          case 15: 
          hex3 = "F";
          break;
          
          
      }// end of Switch
      
      //Checks the value of input after conversion and assigns hexadecimal value to it
        switch( hexBlue ) {
          case 0: 
          hex4 = "0";
          break;
          case 1: 
          hex4 = "1";
          break;
          case 2: 
          hex4 = "2";
          break;
          case 3: 
          hex4 = "3";
          break;
          case 4: 
          hex4 = "4";
          break;
          case 5: 
          hex4 = "5";
          break;
          case 6: 
          hex4 = "6";
          break;
          case 7: 
          hex4 = "7";
          break;
          case 8: 
          hex4 = "8";
          break;
          case 9: 
          hex4 = "9";
          break;
          case 10: 
          hex4 = "A";
          break;
          case 11: 
          hex4 = "B";
          break;
          case 12: 
          hex4 = "C";
          break;
          case 13: 
          hex4 = "D";
          break;
          case 14: 
          hex4 = "E";
          break;
          case 15: 
          hex4 = "F";
          break;
          
          
      }// end of Switch
      
      //Checks the value of input after conversion and assigns hexadecimal value to it
        switch( hexBlue1 ) {
          case 0: 
          hex5 = "0";
          break;
          case 1: 
          hex5 = "1";
          break;
          case 2: 
          hex5 = "2";
          break;
          case 3: 
          hex5 = "3";
          break;
          case 4: 
          hex5 = "4";
          break;
          case 5: 
          hex5 = "5";
          break;
          case 6: 
          hex5 = "6";
          break;
          case 7: 
          hex5 = "7";
          break;
          case 8: 
          hex5 = "8";
          break;
          case 9: 
          hex5 = "9";
          break;
          case 10: 
          hex5 = "A";
          break;
          case 11: 
          hex5 = "B";
          break;
          case 12: 
          hex5 = "C";
          break;
          case 13: 
          hex5 = "D";
          break;
          case 14: 
          hex5 = "E";
          break;
          case 15: 
          hex5 = "F";
          break;
          
    
      }// end of Switch
    
    //Adds all the strings together to make hexadecimal value
    Conversion = hex+hex1+hex2+hex3+hex4+hex5;
    
    //Print out final output
    System.out.println("The decimal numbers R: "+R+",G: "+G+",B: "+B+", is represented in hexadecimal as: "+Conversion);   
    
    }
    
    //Prints out if input values are not within range of 0-255
    else {
        
        System.out.println("Sorry, you must enter values between 0-255");
        
    } // end of else statement
    
    } // end of if statement 
    
    //Prints out if input values are not integers 
    else {
        System.out.println("Sorry, your input must consist of integers.");
    } //end of else statement
    
    } // end of if statement 
    
    //Prints out if input values are not integers 
    else {
        System.out.println("Sorry, your input must consist of integers.");
    } //end of else statement
    
    } // end of if statement
    
    //Prints out if input values are not integers 
    else {
        System.out.println("Sorry, your input must consist of integers.");
    } //end of else statement
    
    }//end of main method 
    
}// end of class