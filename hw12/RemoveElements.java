////////////////////////////////////////////////////
//Wesley Osborne 
//hw12
//RemoveElements Java Program 
//4/18/16
//
/*
Write three methods called in the main method, randomInput(), delete(list,pos), and remove(list,target).

The randomInput() method generates an array of 10 random integers between 0 to 9.  
Implement randomInput so that it fills the array with random integers and returns the filled array. 

The method delete(list,pos) takes, as input, an integer array called list and an integer called pos.  
It should create a new array that has one member fewer than list, and be composed of all of the same members except the member in the position pos.  

Method remove(list,target) deletes all the elements that are equal to target, returning a new list without all those new elements.

*/




//given code 
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }//end of main method 
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }//end of listArray method 
  
  //randomInput method
  public static int [] randomInput(){
      
      //array of size 10
      int [] rand = new int [10];
      
      //puts random values into array from 0-9 
      for (int k = 0; k < 10; k++){
          
      rand[k] = ( (int) (Math.random() * 10) );
          
          
      }//end of loop 
      
        return rand; //return array 
  }//end of randomInput method 
  
  //delete method 
  public static int [] delete( int [] list, int pos ){

      //array of size 9
      int [] ray = new int [9];
      
      //print numbers up to positon selected
      for(int j = 0; j < pos; j++){
          
          ray[j] = list[j];
          
      }//end of loop 
      
      //print numbers after postion selected
      for(int k = pos + 1; k < 10; k++){
          
          ray[pos] = list[k];
          pos++;
          
      }//end of loop
      return ray;//return array 
  }//end of delete method 
  
  //remove method
  public static int [] remove( int [] list, int target ){
      
      //count for size of new array
      int count = 0; 
      
      //searches for inputed target value 
      for(int i = 0; i < 10; i++){
          
          //increments number of times target not found 
          if( list[i] != target ){
          count++;//increment count 
          }//end of if statement 
          
      }//end of loop 
      
      //array of size of count 
      int [] ray = new int [count];
      
      //counter for setting values 
      int count1 = 0;
      
      for( int j = 0; j < 10; j++ ){
          
          //if positon at j doesnt equal target, sets value of that postion to ray
          if( list[j] != target ){
          ray[count1] = list[j];
          count1++;//increment count
          }//end of if statement 
          
          
      }//end of loop 
      return ray;//return ray 
  }//end of remove method 
  
  
}//end of class
