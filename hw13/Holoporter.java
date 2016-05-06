/////////////////////////
//Wesley Osborne
//hw 13
//5/1/16
//
/*
Write a method called soRandom that accomplishes the following:
First, create a 3D array with random length. For each element in this array, 
assign a 2D array with random length. For each 2D array, assign a single dimensional array with random length. 
The array types should all be String. 
This method does not need any input variables and the returned types should be a 3D array (String[][][]). 
All randomly generated arrays should have random lengths from 1 to 10.

Write a method called coder to generate a code every time it is called. 
It should not require any parameters and the return type should be String. 
Now use the soRandom and the coder functions to fill your 3D array with molecule codes. 
Make sure no two molecules have the same code, since it must operate as a unique identifier.

Next, create another method called print that takes in a 3D array and prints it out in the following format. 
The outermost dimension is to be separated by “---”, the 2nd dimensions are separated by “ | ”, and 
elements (codes) are separated by “ , ”. The example below is 2 X 3 X 3. Unlike this example, 
your arrays will be more ragged and your codes will be unique.

Now you want to use the soRandom function to create another empty 3D ragged array. 
This is the holder of the object you just created in a different place: When you holoport your object over, 
this is the container to be filled.

Write a function called holoport that takes in 2 3D arrays (String[][][]) and accomplishes the following:
The first parameter is your original object and the second object is your container in another space. 
Copy over each molecule in your object over to this container.
Note that since the dimensions were randomly generated, and are thus different. We need to deal with two situations here.
If the container is smaller than the object, truncate the object to fit into the container.  
That is, if a given member array is longer than the array it is being copied into, only copy the beginning of that array, 
to the point that the destination is filled.
If the container is bigger than the object, filled the excess space with special code “$$$$$$”. 
This code should not use the function coder since the code is fixed.

Up to this point, you should have holoported your object over to your container. 
Now Microsoft’s researchers would like to see how successful their technology is, two functions are implemented here:
sampling: This function takes in a 3D array and a specified code. 
If the code is found in the array, print out the location in the format of (x,y,z) where x, y, z are the indices on each dimension. 
If not found, print out “Code not found”. The specified code comes from user and make sure the input format is XXYYYY. 
Ask the user for one valid input. If the format is wrong, keep asking.

percentage: This function takes in the original object and the holoported object and 
prints out a percentage that indicates how completely the holoportation is. 
If the holoported object has less molecules than the original, print out a negative percentage.  
If the holoported object has more molecules (including the $$$$$$ ones) than the original, print out a positive percentage. 
See the formula for the percentage calculation below.  
This is performed by counting the number of molecules in each array, and then computing the value below:
Number of Molecule Difference / Number of Molecules in Original Object
Print out the percentage.

To finalize the holoportation, researches would like to see if they can genetically modify the object. 
Please write a function called frankenstein that reorders the object. 
This is an enhanced practice of your Lab 12, so the completion of the lab is highly recommended prior to starting this hw. 
Reorder the elements of each member of each member array in ascending order based on the code. 
The first two digits of the code are characters so they should follow an alphabetic order 
(A should be placed before B in an ascending order). 
If the first two character digits of the two codes are the same, keep on comparing the 4 number digits. 
Reorder the second dimension of the 3D array in ascending order based on the length of each array. 
Shorter arrays placed before longer arrays.
You can choose the type of sorting method you like. 
please print out this little frankenstein using the method print.
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Holoporter
{
    
    public static void main( String [] args )
    {
        String [][][] ray = soRandom();
        
        for(int i = 0; i < ray.length; i++)
        {
            for(int j = 0; j < ray[i].length; j++)
            {
                for(int k = 0; k < ray[i][j].length; k++)
                {
                    ray[i][j][k] = coder();
                        
                }//end of for loop
                    
            }//end of for loop
                
        }//end of for loop
        
        System.out.println("Print : ");
        print(ray);
        String [][][] ray2 = soRandom();
        System.out.println();
        System.out.println("Holoport");
        holoport(ray, ray2);
        
    }//end of main method 
    
    public static String [][][] soRandom ()
    {
        int rand = (int) (Math.random()*11) + 1;
        String [][][] ray3D = new String [rand][rand][rand];
        return ray3D;
    }//end of soRandom method 
    
    public static String coder ()
    {
        Random r = new Random();
        String code ="";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 2; i++) 
        {
            code += alphabet.charAt(r.nextInt(alphabet.length()));
        } // prints 50 random characters from alphabet
        
        String number = "0123456789";
        for( int j = 0; j < 4; j++)
        {
            code += number.charAt(r.nextInt(number.length()));
        }//end of loop 
        
    return code;
    }//end of coder method 
    
    public static void print ( String [][][] ray )
    {
        
        for(int i = 0; i < ray.length; i++)
        {
            if(i == 0 || i == ray.length - 1)
            {
             System.out.print("[");   
            }//end of if statement 
            else
            {
            System.out.print("---");    
            }//end of else statement 
            
            for(int j = 0; j < ray[i].length; j++)
            {
                System.out.print("|" + "[");
                for(int k = 0; k < ray[i][j].length; k++)
                {
                    if( k == ray[i][j].length - 1)
                    {
                        System.out.print("]");
                        
                    }//end of if statement 
                    else
                    {
                      System.out.print(ray[i][j][k] + ",");  
                    }
                    
                        
                }//end of for loop
                    
            }//end of for loop
                
        }//end of for loop
        
        
        
    }//end of print method 
    
    public static void holoport (String [][][] ray, String [][][] ray2)
    {
        String [][][] holoRay = Arrays.copyOf(ray,ray2.length);
        
        
        for(int i = 0; i < holoRay.length; i++)
        {
            if(i == 0 || i == holoRay.length - 1)
            {
             System.out.print("[");   
            }//end of if statement 
            else
            {
            System.out.print("---");    
            }//end of else statement 
            
            for(int j = 0; j < holoRay[i].length; j++)
            {
                System.out.print("|" + "[");
                for(int k = 0; k < holoRay[i][j].length; k++)
                {
                    if( k == holoRay[i][j].length - 1)
                    {
                        System.out.print("]");
                        
                    }//end of if statement 
                    else
                    {
                      System.out.print(holoRay[i][j][k] + ",");  
                    }
                    
                        
                }//end of for loop
                    
            }//end of for loop
                
        }//end of for loop
        
    }//end of holoport method 
    
}//end of class