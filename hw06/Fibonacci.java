////////////////////////////////////////////////////
//Wesley Osborne 
//hw06
//Fibonacci Java Program 
//3/6/16
//
//Program that ask user for 3 integers, the first two positive integers are a1 and a2, 
//and the third n, is the number of Fibonacci numbers to print out.
//Fibonacci numbers begin with two numbers, a1 and a2, and any subsequent number is the sum of the last two.

//import scanner
import java.util.Scanner;

public class Fibonacci {
    
    //main method 
    public static void main( String [] args ) {
        
        //Create scanner to accept user input
        Scanner input = new Scanner( System.in );
        
        int check = 0;
        
        while ( check == 0 ) {
            
            System.out.println("Enter the first number in the sequence: ");//print statement
            
            if ( input.hasNextInt() ) { //checks for int 
                
                int a = input.nextInt();
                if( a > 0 ) {
                    System.out.println("Enter the second number in the sequence: ");//print statement
                    if (input.hasNextInt()){ //checks for int
                    int b = input.nextInt();
                    
                    if ( b > 0){ //checks for postive int 
                        System.out.println("How many custom Fibonacci numbers should be printed? "); //print statement
                        if (input.hasNextInt()){ //checks for int
                            int n = input.nextInt();
                           
                           
                            if ( n > 0) { //checks for postive int 
                                int count = 0;
                                System.out.print( "Your numbers are: "+ a +", "+ b +", ");//print statement
                            //run through to print next sequence of number by indicated fibonnaci amount 
                            while( count < n-2 ){
                                int num = a + b; //next number in sequence
                                System.out.print(num + ", "); //print statement 
                                a = b; //make a = b 
                                b = num; //makes b = to num 
                                count++; //increment count
                            }// end of while loop
                System.out.print("\b\b.");//clears ","
                break;   
                            }//end of if
                        else {
                            System.out.println("Enter a positive integer");//print statement
                        }//end of else
                    }// end of if statement 
                    else {
                        System.out.println("You did not enter an integer, please enter an integer.");//print statement
                        input.next();
                    }//end of else statement
                }//end of if statement 
                else{
                    System.out.println("Enter a postive integer.");//print statement
                }//end of else statement 
                
            }//end of if statement
            
            else {
                System.out.println("You did not enter an integer, please enter an integer.");//print statement
                input.next();// clear input
            }// end of else statement
                }// end of if
                else {
                    System.out.println("Enter a postive integer.");//print statement
                }// end of else
            }//end of if
            else{
                System.out.println("You did not enter an integer, please enter an integer.");//print statement
                input.next(); //clear input 
            }
        }//end of while loop 
        
    }// end of main method 
    
}// end of class