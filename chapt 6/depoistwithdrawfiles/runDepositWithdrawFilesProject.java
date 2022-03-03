package depoistwithdrawfiles;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class runDepositWithdrawFilesProject {
    


    public static void main(String[] args) throws IOException {
        
       DecimalFormat formatter = new DecimalFormat("$###,###,###,##0.00");
       
       double num = 500.00; 

            // object 
            SavingAccount savings = new SavingAccount(num);
    
                // opening the Deposits file
                File fName = new File("Deposits.txt");

                    // checking to see if the exists
                    if(!fName.exists()){
                        System.out.println("File does not exist! Exiting program.");
                        System.exit(0);
                    }
        
                            // scanner to read file contents
                            Scanner fileInput = new Scanner(fName);
                        
                                while(fileInput.hasNext()){
                                    double d = fileInput.nextDouble();

                                        System.out.println("\tDepositing " + formatter.format(d));
                                            savings.deposit(d);
                                }
        
                    System.out.println();
                 System.out.println("Current balance: "+ formatter.format(savings.getBalance()));
                 System.out.println();
                
                        // reading the next file
                    File fName2 = new File("Withdrawals.txt");
                    
                            // checking to see if file exists
                        if(!fName2.exists()){
                            System.out.println("File does not exist! Exiting program.");
                            System.exit(0);
                            System.out.println("Starting balance: " + formatter.format(savings.getBalance()));
                            System.out.println();

                    }
                           
                                    // reading the contents files
                                Scanner fileInput2 = new Scanner(fName2);
                                    
                                    while(fileInput2.hasNext()){
                                        double withdrawal = fileInput2.nextDouble();
                                        System.out.println("\twithdrawing: " + formatter.format(withdrawal));
                                        savings.withdraw(withdrawal);
                                        
                                    }
                                        System.out.println();
                                        System.out.println("Current balance: "+formatter.format(savings.getBalance()));
                                        
                                // getting user input 
                            Scanner keyboard = new Scanner(System.in);
                            double iRate;
                            System.out.print("Enter annual interest rate (%): ");
                            iRate = keyboard.nextDouble();
                            savings.setMonthlyInterestRate(iRate);
                            savings.addInterest();
                            
                            System.out.println("===============================\n");
                            System.out.println("Ending balance: "+  formatter.format(savings.getBalance()));
                            
                            System.exit(0);




        // closing file 
        fileInput.close();
        // closing scanner
        fileInput2.close();
        keyboard.close();

    }
}
