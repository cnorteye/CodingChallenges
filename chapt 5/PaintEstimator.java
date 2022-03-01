import java.util.*;

public class PaintEstimator {

    /* 
        Assignment: 
            1.  write a program that allows the user to enter the number of rooms to be painted and the price of the paint per gallon. 
            2. ask for the sqaure feet of A wall space in each room. 

        Things to keep in mind : 
            program is working with just the measurement of 1 wall space inside a room
            The standard for the assignment is: 115ft (1 wall) = 1 gallon = 8 hours of labor; company charages $18 per 1 hour

    */

    public static void main(String[] args) {

        // Getting user input

        Scanner keyboard = new Scanner(System.in); 

        System.out.println("How many rooms do you want painted: ");
        int rooms = keyboard.nextInt();
        int [] userResponse = new int[rooms];  // array to store the user's sq measurement for each wall
        

                /*
                    Based on how many rooms: ask the user to enter in the sqaure feet of wall space for each room
                    save the responses in an array with the size set to the number of rooms the user wants to paint
                */

                if( rooms == 1 ){
                    System.out.println("Enter the sqaure feet of a wall space for the room:" );
                        int usRes = keyboard.nextInt();
                        // working with just ONE room
                            int gallonPaint = gallonOfPaint(usRes); 
                            int hoursLabor =  hoursOfLabor(usRes); 
                            double costPaint =   costOfPaint(gallonPaint);
                            double costLabor = costOfLabor(hoursLabor); 
                            double newTotal = totalCostOfJob(costLabor,  costPaint); 
                            receipt(rooms,  newTotal);
                }else{
                    // save it into an array
                    int i = 0;
                  int count = 1;    // holds the count for each room 
                  double overrallCostOfJob = 0;    // holds the total amount for painting all the rooms
                    while(i < rooms) {
                        System.out.println("Enter the sqaure feet of wall space for room " + count + ":" );
                        userResponse[i] = keyboard.nextInt(); 
    
                            
                        int gallonPaint = gallonOfPaint(userResponse[i]); 
                        int hoursLabor =  hoursOfLabor(userResponse[i]); 
                        double costPaint =   costOfPaint(gallonPaint);
                        double costLabor = costOfLabor(hoursLabor); 
                        double newTotal = totalCostOfJob(costLabor,  costPaint); 
                        overrallCostOfJob += newTotal;  
                    
                        i++;
                        count++;
                        
                    }
                    
                    receipt(rooms, overrallCostOfJob);
                }
                
                
                //System.out.println(userResponse);
        

            
    
            

        keyboard.close();

    }



    /*
        1 wall = 115sf
        115 sf = 1 gallon of paint; 8 hours of labor
        This method returns the number of gallons of paint requried for each room
    */

    public static int gallonOfPaint(int wall){
        return wall * 4 / 115; 
    }

    /*
        This method returns the number of hours labor required to paint each wall
        115sf = 8 hours 
        multiplying the user's wall sf by 8 hours and dividing by 115 to get hours needed
    */

    public static int hoursOfLabor(int wall){
         
        return wall * 4 * 8 / 115; 

    }

    /*
        This method returns the cost to paint one of the 
        average paint per gallon: create a preset price for the average paint per gallon
        according to google: on average, you can expect to pay anywhere between $15 and $30 per gallon of paint
    */

    public static double costOfPaint (int gallonOfPaint){
       double priceOfPaintPerGallon = 15; 
        return priceOfPaintPerGallon * gallonOfPaint;  
    }


     /*
        This method return the labor charges
        company charges $18.00 per hour for labor
    */


    public static double costOfLabor(int hoursOfLabor){
        return hoursOfLabor * (double ) 18; 
    }


    /*
        This method returns the total cost of the paint job for one room
        average sales tax = 5.09%
    */

    public static double totalCostOfJob(double costOfLabor, double costOfPaint){
        double salesTax = 5.09; 
        return costOfLabor + costOfPaint + salesTax; 

    }


    public static void receipt(int x, double y){
       //double a =  Math.round(y);
         //Printing out the receipt to the user
         System.out.println();
         System.out.println("This is your total estimate for your room(s): \t");
         System.out.println("\t");
         System.out.println(" In order to paint " + x + " room(s), your total estimate is $ " + y);
    }
    

}
