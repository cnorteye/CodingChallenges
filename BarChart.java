import java.util.Scanner;


public class BarChart {


    public static void main(String[] args) {

        /*
            ASSIGNMNET: write a program that asks the user to enter today's sales for five stores. 
            the program should display a bar chart comparing each store's sales. create each bar in the bar chart by displaying a row of asterisks.
            each asterisk should represent $100 of sales. 
        */

            Scanner scan = new Scanner(System.in);
        
        // user inputs

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
        

        // assigning 100 to the * 
            char asteriKS = '*';


        System.out.println("\t SALES BAR CHART");
        /*

        String one = "Store 1: ";
        String two = "Store 2: ";
        String three = "Store 3: ";
        String four = "Store 4: ";
        String five = "Store 5: ";
        */

        repeatChar(asteriKS, Store1);
        System.out.println();
        repeatChar(asteriKS, Store2);
        System.out.println();
        repeatChar(asteriKS, Store3);
        System.out.println();
        repeatChar(asteriKS, Store4);
        System.out.println();
        repeatChar(asteriKS, Store5);
        System.out.println();





        
        //System.out.printf("%s%n", one, repeatChar(asteriKS, Store1));
        //System.out.printf(two, repeatChar(asteriKS, Store2));
        //System.out.printf(three,repeatChar(asteriKS, Store3));
        //System.out.printf(four, repeatChar(asteriKS, Store4));
        //System.out.printf(five, repeatChar(asteriKS, Store5));


        scan.close();
    }
    


public static Object[] repeatChar (char c , double s){

    int n = (int) (s / 100); 
    
    int i = 0;
    /*

    do{
        System.out.print(c + " ");
        
        i++;
    }
    while(i < n);
    System.out.println();

    */

    while(i < n){
        System.out.print(c + " ");
        
        i++;
    }

return new Object[0];
} 

} 