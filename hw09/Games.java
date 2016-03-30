////////////////////////////////////////////////////
//Wesley Osborne 
//hw09
//Games Java Program 
//3/29/16
//
// a program that gives the user a choice of 3 mini games, a word scrambler,
// guess the box game, and spin the wheel game.

//Import Scanner
import java.util.Scanner;

//Import Random number generator 
import java.util.Random;

//Games Class
public class Games {
    
    //Main Method 
    public static void main ( String[] args ){
        
        //create scanner for user input 
        Scanner input = new Scanner( System.in );
            
            //Print statements welcoming the user to the game and asking for input 
            System.out.println("Welcome to Wesley's game center!");
            System.out.println("Choose which game you would like to play: guessTheBox, spinTheWheel, and scrambler.");
            
            //Stores input into a string 
            String check = input.next();
            
            //Checks to see if input is equal to options of the game 
            if( check.equals("guessTheBox") ){
                
                //Call to guessTheBox method 
                guessTheBox();
                
                
            }//end of if statement 
            
            //Checks to see if input is equal to options of the game
            else if( check.equals("spinTheWheel") ){
                
                //Call to spinTheWheel method
                spinTheWheel();
                
                
            }// end of else if statement 
            
            //Checks to see if input is equal to options of the game
            else if( check.equals("scrambler") ){
                
                //Call to spinTheWheel method
                scrambler();
                
                
            }//end of else if statement
            

            else {
                
                //Print Statement if wrong input is entered
                System.out.println("Error: Sorry, arcade does not have that game.");
                
            }//end of else statement 
            
        
    }//end of main method
    
    //guessTheBox Method 
    public static void guessTheBox(){
        
        //Create Scanner for user input
        Scanner input = new Scanner( System.in );
        
        //Random number generator betwwen 1 and 3
        int winBox = ((int)(Math.random()*3)+1);
        
        //Continous loop that breaks when game is correctly played 
        while( true ){
            
            //Print Statement asking the user for input
            System.out.println("Enter a number between 1 & 3.");
            
            //Store input into a boolean 
            boolean check = input.hasNextInt();
            
            //Checks to see if input is an int 
            if( check ){
                
               //Stores input into an int 
               int box = input.nextInt();
               
               //Checks to see if input is between 1 and 3
                if( box > 0 && box < 4 ){
                
                //Checks to see if input is equal to random number 
                if (box == winBox ){
                    
                    //Print statement stating user has won
                    System.out.println("You win a prize");
                    break; //end program
                }//end of if statement 
                else{
                    //Print statement stating user has lost 
                    System.out.println("Sorry you lose");
                    break; //end program 
                }//end of else statement
                }// end of if statement 
                else{
                    //Print statement for invalid input
                    System.out.println("Error");
                }//end of else statment
            }//end of if statement
            else {
                //Print statement for invalid input 
                System.out.println("Error Invalid Input. Restart Game.");
                break;//end program
            }//end of else statement
            
        }//end of while loop 
        
    }//end of guessTheBox method 
    
    public static void spinTheWheel() {
        
         //Create scanner for user input
         Scanner input = new Scanner( System.in );
         
         //Random number generator between 1 and 5
         int randomNum = ((int)(Math.random()*5)+1);
         
         //Random number generator between 1 and 2 
         int randomColor = ((int)(Math.random()*2)+1);
         
         //Stores chosen color for a number
         int chosenColor;
         
         //Continous loop that breaks when game is correctly played 
         while( true ){
         
         //Print statement asking user to enter input 
         System.out.println("Enter a number between 1 and 5");
         
         //Stores input into a boolean
         boolean numCheck = input.hasNextInt();
         
         //Checks to see if number is an int
         if(numCheck){
             
             //Stores input into an int 
             int num = input.nextInt();
             
             //Checks to see if input is between 1 and 5
             if( num > 0 && num < 6 ){
                 
             //Print Statement asking user for input      
             System.out.println("Enter a color: red or black");
             
             //Stores input into string
             String colorCheck = input.next();
             
             //Checks if input matches string
             if(colorCheck.equalsIgnoreCase("Red")){
                 
                 //Makes chosen color equal to 1
                 chosenColor =1;
                 
                 //Checks to see if chosen color and number are equal to random spin
                 if( chosenColor == randomColor && num == randomNum ){
                     
                     //Print Statement if user won
                     System.out.println("Congrats you won! Spun: Red "+randomNum+" Your guess: Red "+num);
                     break; //end program
                 }//end of if statement 
                 else{
                     
                  //Print Statement if user lost 
                  System.out.println("Sorry you lose! Spun: Black "+randomNum+" Your guess: Red "+num);
                  break; //end program
                 }//end of else statement
             }//end of if statment
             
             //Checks if input matches string
             else if(colorCheck.equalsIgnoreCase("Black")){
                 
                 //Makes chosen color equal to 1
                 chosenColor =2;
                 
                 //Checks to see if chosen color and number are equal to random spin
                 if( chosenColor == randomColor && num == randomNum ){
                     
                     //Print Statement if user won
                     System.out.println("Congrats you won! Spun: Black "+randomNum+" Your guess: Black "+num);
                     break;//end program
                 }//end of if statement 
                 else{
                     
                  //Print statement if user lost      
                  System.out.println("Sorry you lose! Spun: Red "+randomNum+" Your guess: Black "+num);
                  break;//end program
                 }//end of else statement
                 
             }//end of else if statement
             else{
                 
                 //Print statement for wrong input
                 System.out.println("Enter Red or Black");
             }//end of else statement
             
            }//end of if statement
            else {
                
                //Print statement for invalid input
                System.out.println("Error");
            }//end of else statement
         }//end of if statement 
         else{
             
             //Print statement for wrong input 
             System.out.println("Error Invalid Input. Restart Game.");
             break;//end program
         }//end of else statement
            
         }//end of loop
         
        
        
    }//end of spintTheWheel method
    
    //scrambler method
    public static void scrambler() {
        
        //Create scanner to except user input
        Scanner input = new Scanner( System.in );
        
        //Create random number generator 
        Random randomNum = new Random();
        
        //Continous loop that breaks when game is correctly played 
        while( true ){
        
        //Print statement asking user for input
        System.out.println("Enter a word");
        
        //Stores input into boolean
        boolean checkWord = input.hasNext();
        
        //Checks to see if input is a string
        if( checkWord ){
            
            //Store input into string
            String word = input.next();
            
            //Runs the loop enough times to scramble the word properly
            for(int i = 0; i < 10; i++){
                
                //Stores random number into int
                int ran = randomNum.nextInt(word.length());
                
                //Stores letter corresponding to postion of random number int a char
                char letter = word.charAt(ran);
                
                //Converts char into string
                String scram = Character.toString(letter);
                
                //Runs loop amount of length
                for( int j = 1; j < word.length(); j++ ){
                    
                    //Checks to see if random number equals portion of loop
                    if( j != ran ){
                        
                        //Stores new letter into scram
                        scram = scram + Character.toString(word.charAt(j));
                        
                    }//end of if statement
                    else{
                        
                        //Stores new letter into scram
                        scram = scram + Character.toString(word.charAt(0)); 
                        
                    }// end of else statement 
                }//end of loop 
                
                //Stores new scrambled word
                word = scram;
                
            }//end of loop
            
            //Print statement of scrambled word
            System.out.println("Your scrambled word is: "+ word);
            break;//end program
            
        }//end of if statement
        else{
            
            //Print statement of wrong input 
            System.out.println("Enter a string. Restart.");
            break;//end program 

        }//end of else statement
    
        }//end of loop 
    }//end of scrambler method 
    
}//end of class