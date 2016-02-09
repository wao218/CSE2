/////////////////////////////////////////////////////
//Wesley Osborne
//hw02
//Arithmetic Java Program
//
//compute the cost of the items you bought, plus the PA sales tax of 6%
//

//  Define a class
public class Arithmetic {
    
//  main method
    public static void main(String[] args) {
    
    //Number of pair of pants
    int numPants = 3;
    //Cost per pair of pants
    double pantsPrice = 34.98;
    
    //Number of sweatshirts
    int numShirts = 2;
    //Cost per shirt
    double shirtPrice = 24.99;
    
    //Number of belts
    int numBelts = 1;
    //Cost per belt
    double beltCost = 33.99;
    
    //the tax rate
    double paSalesTax = 0.06;
    
    //Total cost of pants
    double totalCostPants = numPants * pantsPrice;
    //Total cost of sweatshirts
    double totalCostShirts = numShirts * shirtPrice;
    //Total cost of belts
    double totalCostBelt = numBelts * beltCost;
    
    //Sales tax on pants
    double taxPants = totalCostPants * paSalesTax;
    //Sales tax on sweatshirts
    double taxShirts = totalCostShirts * paSalesTax;
    //Sales tax on belts
    double taxBelts = totalCostBelt * paSalesTax;
    
    //Total cost of purchase before tax
    double totalBeforeTax = totalCostBelt + totalCostPants + totalCostShirts;
    
    //Total Sales Tax
    double totalSalesTax = taxPants + taxBelts + taxShirts;
    
    //Total cost of purchase with tax
    double totalSalePrice = totalBeforeTax + totalSalesTax;
    
    //Display cost of each itme, total sales tax, total cost of purchases before and after taxes 
    System.out.println("The cost of pants: $"+pantsPrice);
    System.out.println("The total cost of pants purchased: $"+totalCostPants);
    System.out.println("The cost of sweatshirts: $"+shirtPrice);
    System.out.println("The total cost of sweatshirts purchased: $"+totalCostShirts);
    System.out.println("The cost of belts: $"+beltCost);
    System.out.println("The total cost of belts: $"+totalCostBelt);
    System.out.println("The sales tax on pants: $"+(int)(taxPants*100)/100.0);
    System.out.println("The sales tax on sweatshirts: $"+(int)(taxShirts*100)/100.0);
    System.out.println("The sales tax on belts: $"+(int)(taxBelts*100)/100.0);
    System.out.println("The total cost of purchase before tax: $"+totalBeforeTax);
    System.out.println("The total sales tax: $"+ (int)(totalSalesTax*100)/100.0);
    System.out.println("The total cost of purchase including tax: $"+(int)(totalSalePrice*100)/100.0);
    
    }// end of main method
    
}// end of class 