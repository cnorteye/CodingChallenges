package savingaccount;
import java.text.DecimalFormat;
import java.util.*;

public class runSavingAccount {

    /*
        ASSIGNMENT: Test the class in a program that calculates the balance of a savings account at the end of a period of time. It should ask the user for the annual interest rate, the starting balance, and the number of months that have passed since the account was established. 
                    A loop should then iterate once for every month, performing the following:
                        1. Ask the user for the amount deposited into the account during the month. Use the class method to add this amount to the account balance.
                        2. Ask the user for the amount withdrawn from the account during the month. Use the class method to subtract this amount from the account balance.
                        3. Use the class method to calculate the monthly interest.
                        After the last iteration, the program should display the ending balance, the total amount of deposits, the total amount of withdrawals, and the total interest earned.
    */

    public static void main(String[] args) {
        // Decimal Format
        DecimalFormat dollar = new DecimalFormat("$###,###,###,##0.00");

        // variables
        double totalInterest = 0; 
        double  totalDeposit = 0; 
        double  totalWithdrawals = 0;
       

        // Getting user input
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the starting balance: ");
        double balance = keyboard.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double annualRate = keyboard.nextDouble();
        System.out.println("Months account has been open for: ");
        int months = keyboard.nextInt();
        System.out.println();
        

        // creating an object of the class
        SavingAccount s = new SavingAccount(balance);
        
        
        s.setMonthlyInterestRate(annualRate);           // calculating the monthly interest rate
        
        for(int i = 1; i <= months; i++){
    
            // deposit
            System.out.print("Enter amount deposited for month " + i + " : ");
            double deposited = keyboard.nextDouble();
            s.deposit(deposited);                   // calling method for adding the deposit amount to balance
            totalDeposit += deposited;              // updating the total deposit variable
            

            // withdraw
            System.out.print("Enter amount you withdrew for month " + i + ": ");
            double withdrawed = keyboard.nextDouble();
            s.withdraw(withdrawed);                 // calling method for subtracting withdraw from balance
            totalWithdrawals += withdrawed;         // updating the total withdrawal variable 
           
            System.out.println("\n");
           
           

            double currentBalance = s.getBalance();         // returns the current balance
            
            s.addInterest();                // adding the interest rate to the balance
            
            double addedInterest = s.getBalance()- currentBalance;          // returns the interest rate added to the current balance

            totalInterest += addedInterest;         // updating the total interest rate
            
        
        }
        
      
        System.out.println("----------------------------------------\n");
        System.out.println("Ending balance: " + dollar.format(s.getBalance()));
        System.out.println("Total amount of deposits: " + dollar.format(totalDeposit));
        System.out.println("Total amount of withdrawals: " + dollar.format(totalWithdrawals));
        System.out.println("Total interest earned: " + dollar.format(totalInterest));



        keyboard.close();  // closing scanner
    }


    }
    
