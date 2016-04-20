////////////////////////////////////////////////////
//Wesley Osborne 
//hw12
//CSE2linear Java Program 
//4/18/16
//
/* 
A program that prompts the user to enter 15 ints for students’ final grades in CSE2. 
Check that the user only enters ints, and print an error message if the user enters anything other than an int.  
Print a different error message for an int that is out of the range from 0-100, 
and finally a third error message if the int is not greater than or equal to the last int.  
Print the final input array.  
Next, prompt the user to enter a grade to be searched for. Use linear search to find the entered grade. 
Indicate if the grade was found or not, and print out the number of iterations used. 
Next, scramble the sorted array randomly, and print out the scrambled array. 
Prompt the user again to enter an int to be searched for, and use linear search to find the grade. 
Indicate if the grade was found or not, and how many iterations it took. 
*/

//import scanner 
import java.util.Scanner;

//CSE2Linear class
public class CSE2Linear {
    
    //Main method
    public static void main (String [] args ){
        
        //Scanner constructor 
        Scanner input = new Scanner ( System.in );
        
        //Array filled with ints of length 15
        int [] grades = new int [15];
        
        //Prompt user to enter grades
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        
        //Goes through loop the lenght of the array 
        for( int i = 0; i < grades.length; i++ ){
            
            //checks for int 
            if( input.hasNextInt() ){
                
                //Initializes array with ints 
                grades[i] = input.nextInt();
                
                //checks to make sure grades are between 0 and 100
                if( grades[i] < 0 || grades[i] > 100 ){
                    
                    //Prints out error message 
                    System.out.println("Error: you did not enter an in between 0 and 100");
                    break;//end program
                }//end of if statement 
                
                else{
                    //checks if past position 0 
                    if( i > 0 ){
                        
                        //checks to make sure new grade is larger than or equal to previous 
                        if(grades[i] >= grades[i - 1] ){
                            continue;//continues through loop 
                        }//end of if statement 
                        else{
                            //print out error message 
                            System.out.println("Error: You did not enter a grade greater than the last. ");
                            break;//ends program 
                        }//end of else statement 
                    }//end of if statement 
                    
                    
                }//end of else statement 
                
            }//end of if statement 
            else{
                //prints out error message 
                 System.out.println("Error: you did not enter an int");
                break;//end program 
            }//end of else statement 
            
        }//end of for loop 
        
        //print out message
        System.out.print("Sorted: ");
        
        //prints out array 
        for (int j = 0; j < grades.length; j++){
            System.out.print( grades[j] + " ");
        }
        System.out.println(); //print new line
        linearSearch( grades );//use linearSearch method 
        scramble( grades );//use scramble methoe
        
    }//end of main method
    
    //LinearSearch Method 
    public static void linearSearch (int [] grad ){
        
        //Scanner constructor 
        Scanner input = new Scanner( System.in );
        
        //Prompt user to enter a grade to search for 
        System.out.println("Enter a grade to search for: ");
        
        
        int count = 1; //count for iterations 
        
        //checks for int 
        if( input.hasNextInt() ){
        
        //stores search value 
        int search = input.nextInt();
        
        
        //Goes through loop and searches for grade inputted 
        for (int i = 0; i < 15; i++){
            
            //If grade found print out grade and number of iterations 
            if( grad[i] == search ){
                System.out.println( search + " was found in the list with "+ (i + 1) + " interations");
                break;//end program 
            }//end of if statement 
            
            //If grade not found print out grade and number of iterations
            else if( count == 15 && grad[i] != search ){
                
                System.out.println( search + " was not found in the list with "+ count + " interations");
                
            }//end of if statement 
            count++;//increment count 
        }//end of loop 
        
        }//end of if statement 
        else{
            //print out error message 
            System.out.println("Error: you did not enter an int ");
            
        }//end of else statement 
        
    }//end of linearSearch method
    
    //Scramble method 
    public static void scramble (int [] grad ){
        
        //Scanner construcor 
        Scanner input = new Scanner( System.in );
        
        
        //Goes through loop and for each postion in array replaces it with new value 
        for( int i = 0; i < 15; i++ ){
        
        int temp = grad[i]; //temp number 
        int num = ( (int) (Math.random() * 15) );//random postion     
            
            //If the random positon selected does not equal the value of postion i then swap those numbers and set random selected positon to temp  
            if( i != num ){
                
                grad[i] = grad[num];
                grad[num] = temp; 
                
            }//end of if statement 
            
        }//end of loop 
        
        //print out message 
        System.out.print("Scrambled: ");
        
        //print out array 
        for (int j = 0; j < 15 ; j++){
            System.out.print( grad[j] + " ");
        }
        System.out.println();//print new line 
        
        
        
        //Prompt user to enter a grade to search for 
        System.out.println("Enter a grade to search for: ");
        
        
        int count = 1; //count for iterations 
        
        //checks for int 
        if( input.hasNextInt() ){
        
        //stores search value 
        int search = input.nextInt();
        
        
        //Goes through loop and searches for grade inputted 
        for (int i = 0; i < 15; i++){
            
            //If grade found print out grade and number of iterations 
            if( grad[i] == search ){
                System.out.println( search + " was found in the list with "+ (i + 1) + " interations");
                break;//end program 
            }//end of if statement 
            
            //If grade not found print out grade and number of iterations
            else if( count == 15 && grad[i] != search ){
                
                System.out.println( search + " was not found in the list with "+ count + " interations");
                
            }//end of if statement 
            count++;//increment count 
        }//end of loop 
        
        }//end of if statement 
        else{
            //print out error message 
            System.out.println("Error: you did not enter an int ");
            
        }//end of else statement 
        
        
        
        
    }// end of scramble method  
    
    
    
}//end of class