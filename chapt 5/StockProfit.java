import java.util.Scanner;

public class StockProfit {
    
    /*
        The profit from the sale of a stock can be calculated as follows:
            profit = ((NS X SP) - SC) - ((NS X PP) + PC)
            NS = number of shares
            PP = Price per share
            PC = purchase commission paid
            SP = sale price per share
            SC = sale commission paid

            positve = profit 
            negative = loss

            ASSIGNMENT: 
                write a method that accepts as arguments the number of shares, the purchase price per share, 
                the purchase commission paid, the sale price per share, and the sale commission paid. 
                The method should return profit (or loss) from teh sale stock. 

                Demonstrate the method in a program that asks the user to enter the necessary data and display the amount of the profit or loss.
    */



    public static void main(String[] args) {


        // GETTING USER INPUT

        Scanner scan = new Scanner(System.in); 

        System.out.printf("%n%s%n%s%n   %s%n   %s%n", 
         "WELCOME TO CALCULATE MY STOCK.", 
         "Here we will help you determine whether the sale of your stock will result in a profit or a loss.", 
         "To help you, we will have answer a series of questions. If you don't know, just guess",
         "Good luck!");


         System.out.println("How many shares of Stock do you own?");
         double numberOfShares = scan.nextDouble();

         System.out.println("What was the cost to buy ONE share?");   // purchase price per share
         double purchasePrice = scan.nextDouble();

         System.out.println("How much commission did you pay to buy EACH of the share of your stock?");   // purchase commission paid
         double purchaseCommission = scan.nextDouble();

         System.out.println("At what price are you trying to sell EACH of your share?");
         double salePricePerShare = scan.nextDouble();

         System.out.println("What is the average commission cost for selling your shares?");  // fee charaged by the broakerage firm that makes the transaction
         double saleCommission = scan.nextDouble();


            // calculation
         stockCalculator(numberOfShares, purchasePrice, purchaseCommission, salePricePerShare, saleCommission);





        scan.close();
    }


    public static void stockCalculator (double ns, double pp, double pc, double sp, double sc){

        double profit = (((ns * sp) - sc) - ((ns * pp) + pc));
        System.out.println();

        if (profit <= 0){
            System.out.println("The sale of your stock returned a profit of " + profit + " which is a LOSS");
        }else{
             System.out.println("The sale of your stock returned a profit of " + profit + " which is a PROFIT");
        }

    }
}
