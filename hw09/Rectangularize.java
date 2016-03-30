////////////////////////////////////////////////////
//Wesley Osborne 
//hw09
//Rectangularize Java Program 
//3/29/16
//program will have two methods that both return void and have the same name. 
//The only difference is that one method will accept and int and the other will accept a string. 
//The method that accepts an int will print out a square of % characters with length and width of the number that provided as input. 
//The method that accepts a string will print the string out the same number of times as there are characters in the string.


//Import Scanner
import java.util.Scanner;

//Rectangularize Class
public class Rectangularize {
    
    //Main method 
    public static void main ( String[] args ){
        
        //create scanner for user input 
        Scanner input = new Scanner( System.in );
        
        //Continous loop that breaks when input is correctly inputted 
        while(true){
        
        //Print statement asking user for string or integer     
        System.out.println("Please enter a string or an integer");
        
        //Stores input into boolean
        boolean checkInt = input.hasNextInt();
        boolean checkString = input.hasNext();
        
        //Checks to see if input is an int 
        if( checkInt ){
            
            //Stores input int
            int num = input.nextInt();
            
            //calls rectangle method for int
            rectangle( num );
            break;//end program
            
        }//end of if statement 
        
        //Checks to see if input is a string
        else if( checkString ){
            
            //Stores input into string
            String word = input.next();
            
            //Calls rectangle method for strings
            rectangle( word );
            break;//end program
        }//end of else if statement 
        else{
            
            //Print statement for wrong input 
            System.out.println("Error: enter an int or a string");
        }//end of else statment 
        }//end of loop 
        
    }//end of main method 
    
    //Rectangle method for ints
    public static void rectangle( int x ) {
        
        //Print statement
        System.out.println("Output: ");
        
        //For loop for number of lines
        for( int i= 0; i < x; i++ ){
            
            //For loop for number of % 
            for( int j =0; j < x; j++ ){
                
                //Print statement for %
                System.out.print("%");
            }//end of for loop 
         
         //Print statement for new line
         System.out.println();   
        }//end of for loop 
      
    }//end of rectangle method 
    
    //Rectangle method for strings
    public static void rectangle( String x ) {
        
        //Print statement
        System.out.print("Output: ");
        
        //Prints out number of lines
        for( int i= 0; i <= x.length(); i++ ){
         
         //Prints out input    
         System.out.println(x);   
        }//end of for loop
      
    }//end of rectangle method 
    
}//end of class 