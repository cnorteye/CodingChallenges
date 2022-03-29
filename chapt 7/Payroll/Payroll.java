

import java.util.Arrays;
import java.util.Scanner;

public class Payroll {

    // fields
        public static final int SIZE = 7;
        int [] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        String [] employeeName = {"Sam", "Susan", "John", "Maxwel", "Lindsay", "Martha", "Chica"};
        int [] hours = new int [SIZE];              // holds employees hours worked
        double [] payRate = new double [SIZE];      // holds employees hourly pay rate
        double [] wages = new double [SIZE];        // holds emplyees gross wages
       

    // no-args constructor 
    public Payroll(){
        // accepts no argument
    }

    // method that gets the pay rate from the user
        public void setPayRate(){
            Scanner keyboard = new Scanner(System.in); 

            
            for(int i = 0; i < payRate.length; i++){
                System.out.println(" Enter a payrate amount for " + employeeName[i]); 
                payRate[i] = keyboard.nextDouble();

                // user input validation
                if(payRate[i] <= 6.0){
                    System.out.println(" Enter a payrate higher than $6"); 
                    payRate[i] = keyboard.nextDouble();
                }
            }

            System.out.println("THANK YOU FOR THOSE PAYRATES!");

      

            

        }


     // method that gets the user's hours
        public void setHoursWorked(){
                Scanner reader = new Scanner(System.in); 

                
                for(int i = 0; i < hours.length; i++){
                    System.out.println(" Enter the hours worked " + employeeName[i]); 
                    hours[i] = reader.nextInt();

                }
                System.out.println("THANK YOU FOR THOSE HOURS!");
                
            


            }


        // setter for payrate
        public double [] getPayRate(double [] pay){
            /*
                Arrays.copyOf to copy an entire array into another array
            */
            this.payRate = Arrays.copyOf(pay, pay.length); 
            return payRate; 
        }

        // setter for hours
        public double [] getHoursWorked(int [] pay){
            this.hours = Arrays.copyOf(pay, pay.length); 
            return payRate; 
        }

   

    // method that calculates each employee's gross pay

    public void calculateGrossPay(){

        setHoursWorked();           // calling the method to get hours worked
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        setPayRate();               // calling the method to get pay rate
        System.out.println("**************************************************");

        getPayRate(payRate);            
        getHoursWorked(hours); 
       
        // gross pay = hours * payrate
        for(int index = 0; index < employeeID.length; index++){

            wages[index] = hours[index] * payRate[index]; 
            System.out.println( employeeName[index] + " : " + employeeID[index] + " earned " + wages[index]);
            System.out.println();

        }
      

    }


    


    



}
