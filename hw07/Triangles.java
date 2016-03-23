////////////////////////////////////////////////////
//Wesley Osborne 
//hw07
//Triangles Java Program 
//3/20/16
//
//a program that forces the user to enter an integer between 5 and 30, inclusive, 
//and then prints out displays that depend on the value entered

//import scanner
import java.util.Scanner;

//Triangles Class
public class Triangles {
    
    //Main Method
    public static void main( String[] args ){
        
        //Create Scanner for user input 
        Scanner input = new Scanner( System.in );
        
        
        while( true ){
            
            System.out.println("Enter a number between 5 and 30: ");
            
            
            //makes input into a boolean 
            boolean a = input.hasNextInt();
         
            //checks if input is an int
            if( !a ){
                input.next(); //clears old input for new input 
            }// end of if statement 
            
            else {
                //stores input into an int
                int num = input.nextInt(); 
                
                //checks if input is between 5 and 30.
                if( num >= 5 && num <= 30 ){
                  
                  /*for( int i = 1; i <= num; i++ ){ //creates the number of rows
                      for( int j = 1; j <= i; j++){ //creats the number of columns 
                          System.out.print( i + " "); //prints out numbers in pattern
                      }
                      System.out.println(); //prints out new line
                  }
                  
                  for ( int i = num-1; i >= 1; i--){ //creates number of rows
                      for( int j = 1; j <= i; j++){ //creates number of columns
                          System.out.print( i + " "); //prints out numbers in pattern
                      }
                      System.out.println(); //prints out new line
                  }*/
                  
                  
                  /*int i = 1;//counter for i 
                  
                  while( i <= num ){ //creates number of rows
                  
                    int j = 1; //counter for j  
                    
                      while( j <= i ){ //creates number of columns 
                      
                          System.out.print( i + " "); //prints out pattern 
                          j++; //increments j 
                          
                      }//end of loop 
                      
                      System.out.println(); //print out new line 
                      i++; //increment i 
                      
                  }//end of loop 
                  
                  i = num - 1; //counter for i 
                  
                  while( i >= 1 ){ //creates number of rows 
                      
                      int j = 1; //counter for j
                      
                      while( j <= i ){ //creates number of columns 
                      
                          System.out.print( i + " "); //prints out pattern 
                          j++; //increments j 
                          
                      }//end of loop 
                      
                      System.out.println(); //prints out new line 
                      i--; //increments i 
                      
                  } //end of loop */
                  
                  
                  int i = 1; //counter for i 
                  
                  do{ //creates the number of rows 
                      int j = 1;
                      do{ //creates the number of columns 
                          System.out.print( i + " "); //prints out pattern
                          j++; //increments j 
                      }while( j <= i ); //end of loop 
                      System.out.println(); //prints out new line 
                      i++; //increments i 
                  }while ( i <= num ); //end of loop 
                  
                  i = num - 1; //counter of i 
                  do{ //creates the number of rows 
                      int j = 1; //counter for j 
                      
                      do{ //creates the number of columns 
                          System.out.print( i + " "); //prints out pattern 
                          j++; //increments j 
                      }while( j <= i); //end of loop 
                      System.out.println(); //prints out new line 
                      i--; //increments i 
                  }while( i >= 1); //end of loop 
                  
                  break; //ends program 
                } //end of if statement 
                
                else{
                    System.out.println("Enter a number between 5 and 30.");
                    num = input.nextInt(); //clears old input for new input 
                } //end of else statement 
            } //end of else statement 
            
            
        } //end of loop 
        
    } //end of main method 
} //end of class