
import java.util.Scanner;


public class BarChart {


    public static void main(String[] args) {

        /*
            ASSIGNMNET: write a program that asks the user to enter today's sales for five stores. 
            the program should display a bar chart comparing each store's sales. create each bar in the bar chart by displaying a row of asterisks.
            each asterisk should represent $100 of sales. 
        */

        
        // Create a scanner object
        
        Scanner scan = new Scanner(System.in);
        
        // Get user inputs
            System.out.println("Enter today's sales for store 1 : " );
            Double Store1 = scan.nextDouble();
            System.out.println("Enter today's sales for store 2 : " );
            double Store2 = scan.nextDouble();
            System.out.println("Enter today's sales for store 3 : " );
            double Store3 = scan.nextDouble();
            System.out.println("Enter today's sales for store 4 : " );
            double Store4 = scan.nextDouble();
            System.out.println("Enter today's sales for store 5 : " );
            double Store5 = scan.nextDouble();

        

        // variable  for char * 
            char asteriKS = '*';

            
        // variables
        int a;
        int b;
        int c;
        int d;
        int e; 

        // storing the answer from dividing 100 by the user input for each store
        a = (int) (Store1 / 100); 
        b = (int) (Store2 / 100); 
        c = (int) (Store3 / 100); 
        d = (int) (Store4 / 100); 
        e = (int) (Store5 / 100); 

        // another variable initialization; mainly to act as a counter for the while loop 
        int z = 0;
        int y = 0;
        int x = 0; 
        int u = 0; 
        int w = 0;


        

        // Starting output to consle
        System.out.println("\t SALES BAR CHART");
    
        // multiple while loops to get the print of askeriks for each store
            System.out.print("Store 1: ");

            while(z < a){
                System.out.print(asteriKS);
                
                z++;
            }
        
            System.out.println();
            System.out.print("Store 2: "); 
            while(y < b){
                System.out.print(asteriKS);
                
                y++;
            }
        
            System.out.println();
            System.out.print("Store 3: "); 
            while(x < c){
                System.out.print(asteriKS);
                
                x++;
            }
        
            System.out.println();
            System.out.print("Store 4: "); 
            while(u < d){
                System.out.print(asteriKS);
                
                u++;
            }
        
            System.out.println();
            System.out.print("Store 5: "); 

            while(w < e){
                System.out.print(asteriKS);
                
                w++;
            }
        



        scan.close();
    }
    


 




/*
my attempt to create a method so i didn't have to write everything out times 5
and trying to use the printf; MessageFormat and also String.format to try to format the output

public static String repeatChar (char c , double s){

    // store the answer of s / 100 inside variable n

    int n = (int) (s / 100); 
    
    int i = 0;

    // while 1 is less than n, print the c (char), then increment i
    // program will run for the size of n
    while(i < n){
        System.out.print(c + " ");
        
        i++;
    }

    return "";
} 
*/

} 