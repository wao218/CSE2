/////////////////////////////////////////////////////////
//Wesley Osborne
//Demo 0
//Hello World Java Program
//
//  first compile the program
//      javac HelloWorld.java
//  run the program
//      java HelloWorld//

//  define a class
public class HelloWorld{
    
//  add main method
    public static void main(String[] args)  {

//  print the statement with box around it
    System.out.println("########################");
    System.out.println("########################");
    System.out.println("#                      #");
    System.out.println("#   Hello World 2014!  #");
    System.out.println("#                      #");
    System.out.println("########################");
    System.out.println("########################");
    System.out.println("test");
    
   /* String x = "5";
    String y ="7";
    
    System.out.printf("Hi %4s",x);
    System.out.printf("Hi %4s \n %5s",x,y);
    */
    
    
/*    double val1 = 3.0;
double val2 = 7.4;

if ( val1 > val2 ){
    double val3 = 4.4;
    if ( val3 < val2 ) {
        System.out.println("sum1: " + (val1 + val2) );
    }
    else{
        System.out.println("sum2: " +  val1 + val2  );
    }
}
else{
    double val3 = 2.2;
    if ( val3 < val2 ) {
        System.out.println( "sum3: " + val1 + val2   );
    }
    else{
        System.out.println("sum4: " + (val1 + val2) );
    }
}
*/
/* System.out.println("test");
    int i, j, k;
i = j = k = 2;
if (i++ < ++j){
    switch (j++){
        case (1):
            System.out.printf("case 1 ");
            k %= 2;
            break;   // [line 1]
        case (2):
            System.out.printf("case 2 ");
            k /= 3;
            break;   // [line 2]
        case (3):
            System.out.printf("case 3 ");
            k -= 4;
            break;   // [line 3]
        default:
            System.out.printf("default ");
            k *= 5;
            break;   // [line 4]
    }
    System.out.printf("i+j+k = %2.1f", (double)(i - j + ++k));
}
else {
    i++;   // [line 5]
    System.out.printf("else ");
    System.out.printf("i+j+k = %2.1f", (double)(i - j + k++));

}
*/
int myFactor = 2, inputValue=35;
while ( myFactor < inputValue ) {
    if( inputValue % myFactor == 0 ){
        System.out.println("Factor: " + myFactor );
        break;
    }
    myFactor++;
}

    //test/testtest
    }
}