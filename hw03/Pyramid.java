///////////////////////////////////////////////////////////////
//Wesley Osborne
//lab 03
//Pyramid Java Program
//2/11/16
//
//Program that prompts the user for the dimension of a pyramid
//and returns the volue inside the pyramid.

//Import Scanner to accept user input
import java.util.Scanner;

//define class
public class Pyramid {
    
    //Main method
    public static void main(String[] args){
    
    //Create scanner to accept user input
    Scanner input = new Scanner( System.in );
    
    //Prompt the user to enter the length of the square side store that value
    System.out.println("The square side of the pyramid is (input length): ");
    double squareLength = input.nextDouble();
    
    //Prompt user to enter the height of the pyramid and store it
    System.out.println("The height of the pyramid is (input height): ");
    double heightPyramid = input.nextDouble();
    
    //Calculate and print the volume of the pyramid
    double volumePyramid = (squareLength*squareLength*heightPyramid) / 3;
    System.out.println("The volume inside the pyramid is: "+(int) volumePyramid);
    
    }//end of main method
    
} //end of class