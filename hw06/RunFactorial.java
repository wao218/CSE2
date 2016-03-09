////////////////////////////////////////////////////
//Wesley Osborne 
//hw06
//Run Factorial Java Program 
//3/6/16
//
//Using scanner, you will first input an integer that is between 9 and 16 inclusively. 
//Then you need to calculate the factorial of the input number. 

//import scanner
import java.util.Scanner;

//RunFactorial Class
public class RunFactorial {
    
    //main method 
    public static void main( String [] args ) {
        
        //Create scanner to accept user input
        Scanner input = new Scanner( System.in ); 
        int check = 0;
        System.out.println("Please enter an integer that is between 9 and 16:"); //print statement 
        
        while(check == 0){
        boolean a = input.hasNextInt(); // checks for int
        
        if(a){
        int num = input.nextInt();    
        int factorial = num; 
        int down1 = (num - 1); //decrements num 
        
        
        if( num >= 9 && num <= 16 ){ //checks for number between 9 and 16 
          //runs math until it reaches zero then breaks out of loop 
          while( down1 > 0 ) {
             
            factorial = factorial *down1; //arithmetic for factorial 
            down1--; //decrement down 1
          }//end of while loop 
          System.out.println("Input accepted: "+ num +"! "+"= "+factorial ); //print statement 
          check++; //increment check 
        }//end of if statement 
        else {
            System.out.println("Enter a number between 9 and 16"); //print statement 
            input.next(); //clears input 
        }
           
        }//end of if statement 
        else{
            System.out.println("Enter an integer."); //print statement 
            input.next(); //clears input 
        }
        
        
        
    
        }//end of while loop     
    }//end of main method 
    
}//end of class
    
        