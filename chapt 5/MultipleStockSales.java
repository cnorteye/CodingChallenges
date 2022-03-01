import java.util.Scanner;

public class MultipleStockSales {
    


    /*
        The profit from the sale of a stock can be calculated as follows:
            profit = ((NS X SP) - SC) - ((NS X PP) + PC)
            NS = number of shares; PP = Price per share; PC = purchase commission paid; SP = sale price per share; SC = sale commission paid
            positve = profit 
            negative = loss

            ASSIGNMENT: 
                A program that calculates the total profit or loss from the sale of multiple stocks. 
    */



    public static void main(String[] args) {


        // GETTING USER INPUT

        Scanner scan = new Scanner(System.in); 

        System.out.printf("%n%s%n%s%n   %s%n   %s%n", 
         "WELCOME TO CALCULATE MY STOCK.", 
         "Here we will help you determine whether the sale of your stock will result in a profit or a loss.", 
         "To help you, we will have you answer a series of questions. If you don't know, just guess",
         "Good luck!");

                //  QUESTION 1
                System.out.println("How many STOCKS are you trying to sell?");
                    int stocks = scan.nextInt();
                    double [] userResponse = new double [stocks];   // array to store the total of each stock caluclation


                

    

         // Pre-setting some variables to work with
         double purchaseCommission = 6;   
         double saleCommission = 9;
         int count = 1;    // hold the count of each stock
         int countAgain = 1;    // holds the count of each stock during the receipt print out
         double totalSaleOfStock = 0;    // holds the total calculation of all the stocks



         // check depending on how many stocks the user wants to calculate
         if(stocks == 1){
             // Get user input for the individual stock
                System.out.println();
                    
                System.out.println("How many shares of the stock do you own?");
                double numberOfShares = scan.nextDouble();

                System.out.println("What was the cost to buy ONE share of your stock?");   // purchase price per share
                double purchasePrice = scan.nextDouble();

                System.out.println("At what price are you trying to sell EACH share of your stock?");
                double salePricePerShare = scan.nextDouble();

                    // calculation
                    stockCalculator(numberOfShares, purchasePrice, purchaseCommission, salePricePerShare, saleCommission);
         }else{
                // calculations for multiple stocks
                int i = 0;

                while( i < stocks){
                System.out.println();
                System.out.println("How many shares of Stock " + count +  " do you own?");
                double numberOfShares = scan.nextDouble();

                System.out.println("What was the cost to buy ONE share of stock " + count + " ?");   // purchase price per share
                double purchasePrice = scan.nextDouble();

                System.out.println("At what price are you trying to sell EACH of your shares of stock " + count + " ?");
                double salePricePerShare = scan.nextDouble();

                    // accumulating each strock sale into an array
                userResponse[i]  =  stockCalculatorDouble(numberOfShares, purchasePrice, purchaseCommission, salePricePerShare, saleCommission); 

                    // accumulating the total sale of ALL the stocks
                        totalSaleOfStock += stockCalculatorDouble(numberOfShares, purchasePrice, purchaseCommission, salePricePerShare, saleCommission);
                i++;
                count++;


                }
                // printing out the receipt to the user
                System.out.println("\t RECEIPT \t");
                System.out.println("Thank you for shopping with us!");
                System.out.println("See your total receipt for your " + stocks + " stocks");
                for(int y = 0; y < userResponse.length; y++){
                     System.out.println("For stock " + countAgain + " your total was $ " + userResponse[y] );
                    countAgain++;
                }
                System.out.print("Your total sale of ALL your stocks was $ " + totalSaleOfStock );
                System.out.print(" which is a ");
                stockTotalCalculator(totalSaleOfStock);
         }

            
            




        scan.close();
    }


    public static void stockCalculator (double ns, double pp, double pc, double sp, double sc){

        double profit = (((ns * sp) - sc) - ((ns * pp) + pc));
        System.out.println();

        if (profit <= 0){
            System.out.println("The sale of your stock returned a profit of $ " + profit + " which is a LOSS");
        }else{
             System.out.println("The sale of your stock returned a profit of $" + profit + " which is a PROFIT");
        }

    }


    public static double stockCalculatorDouble (double ns, double pp, double pc, double sp, double sc){

        return (((ns * sp) - sc) - ((ns * pp) + pc)); 

    }

    public static void stockTotalCalculator (double tc){


        if (tc <= 0){
            System.out.print(" LOSS!");
        }else{
             System.out.print(" PROFIT!");
        }

    }
    


}

