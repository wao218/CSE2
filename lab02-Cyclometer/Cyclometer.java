///////////////////////////////////////////////////////////////
//Wesley Osborne
//lab 02
//Cyclometer Java Program
//
/*My bicycle cyclometer (meant to measure speed, distance, etc.) records two kinds of data, 
the time elapsed in seconds, and the number of rotations of the front wheel during that time.
*/

//  Define Class
public class Cyclometer {
    
//  main method 
    public static void main(String[] args)  {
    
    int secsTrip1 = 480; //number of seconds for trip 1
    int secsTrip2 = 3220; //number of seconds for trip 2
    int countsTrip1 = 1561; //number of counts of trip 1
    int countsTrip2 = 9037; //number of counts of trip 2 
    
    double wheelDiameter = 27.0, //Diameter of bicycle wheels
    PI = 3.14159, //Value for PI
    feetPerMile = 5280, //number of feet per mile
    inchesPerFoot = 12, //number of inches per foot
    secondsPerMinute = 60; //number of seconds per minute
    double distanceTrip1, distanceTrip2, totalDistance; //distance of distance 1 and 2 and the total distance 
    
    //Print statements
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" mintues and had "+countsTrip1+" counts.");
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
    
    //Run the calculations, store the values.
    distanceTrip1=countsTrip1*wheelDiameter*PI; 
    //Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diamet in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
    //Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    
    
    }// end of main method 
    
}// end of class