////////////////////////////////////////////////////
//Wesley Osborne 
//hw07
//Triangles Java Program 
//3/20/16
//
//a program that asks the user for two integers: Length and Width.  
//Length is to specify how many characters the following pattern should spread, horizontally, across the screen.  
//Width should specify how many characters the following pattern should spread, vertically, across the screen.

//Import Scanner
import java.util.Scanner;

//Twisty Class
public class Twisty {
    
    //Main method
    public static void main( String[] args ){
        
        //create scanner for user input 
        Scanner input = new Scanner( System.in );
        
        
        while( true ){
            
        System.out.print("Input your desired length: ");  
        
          if( input.hasNextInt() ){
              
            int length = input.nextInt();
            
            if( length > 0 && length < 80 ){
                
            System.out.print("Input your desired width: ");
            
            if( input.hasNextInt() ){
                
              int width = input.nextInt();
              
                  if( width < length && width > 0  ){
                      
              for( int i = 1; i <= width; i++ ){ //creates rows 
                  
                  for( int j = 0; j < (width - 1); j++ ){//creates columns 
                  
                      System.out.print(" ");
                      
                      for (j = 1; j <= i; j++ ){
                          
                          if( j  == 1 ){
                            
                              
                              System.out.print("#");
                              
                          }//end of if statement 
                          
                          else{
                              
                              System.out.println(" ");
                              
                          }//end of else statement 
                          
                          for( int k = 1; k < i; k++){
                              
                              if( k == i - 1 ){
                                  
                                  System.out.print("#");
                        
                              }//end of if statement 
                              else{
                                  System.out.print(" ");
                              }
                            }//end of loop 
                            
                      }//end of loop 
                      
                      
                  }//end of loop 
                  
                  System.out.println();
                  
              }//end of loop 
                   
              break;
              
              }//end of if statement
              
              else{
                  
                 System.out.println("Error: Please input an integer smaller than the length, but greater than 0.");
                 
              }//end of else statement 
 
              
            }//end of if statement
            else{
                
                System.out.println("Error: please type in an integer.");
                input.next();
                
            }//end of else statement
            
          }//end of if statement 
          else{
                  System.out.println("Error: Please enter a length less than 80, but greater than 0.");
                  
              }//end of else statement 
              
          }//end of if statement 
          else{
              
              System.out.println("Error: please type in an integer.");
              input.next();
              
          }//end of else statement 
          
        }//end of loop 

    }//end of main method 
    
}//end of class
