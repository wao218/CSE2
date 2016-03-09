////////////////////////////////////////////////////
//Wesley Osborne 
//hw06
//TextSpinner Java Program 
//3/6/16
//
//rite an infinite loop that recreates this effect:
//First it looks like this: /
//then it looks like this: -
//then it looks like this: \
//then it looks like this: |
//then it looks like this, retuning to the original display: /

//TextSpinner class
public class TextSpinner {
    
    //Main method
    public static void main( String[] args){
        
        //Loop that creates a "spinner" to show progress, prints out sequence of symbols infinitely
        while(true){
            
            System.out.print("/\b" ); //print statement 
            System.out.print("-\b"); //print statement 
            System.out.print("\\\b"); //print statement
            System.out.print("|\b"); //print statement 
            
        }//end of while loop
        
    }//end of main method
    
}// end of class