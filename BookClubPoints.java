
import java.util.Scanner;


public class BookClubPoints{

    // declaring a constant
    public static final String STATEMENT = "You have earned "; 
    public static final String STATEMENT2 = " points."; 
    public static void main(String[] args) {

        /* 
            ASSIGNMENT: Write a program that asks the user to enter the number of books that he/she has purchased this month
                        and then display the number of points awarded. 
        */

        // ask user to enter the number of books he/she has purchased this month

        System.out.println("How many books have you purchased this month? Please make sure you enter a number between 0 - 100.");
            
        Scanner scan = new Scanner(System.in);
        int books = scan.nextInt();

        //System.out.println(books);

        int points; 

        if (books == 0 ){
            points = 0;
            System.out.println(STATEMENT + points + STATEMENT2);
        } else if (books == 1 && books < 2){
            points = 5;
            System.out.println(STATEMENT + points + STATEMENT2);
        } else if (books == 2 && books < 3){
            points = 15;
            System.out.println(STATEMENT + points + STATEMENT2);
        }else if (books == 3 && books < 4){
            points = 30;
            System.out.println(STATEMENT + points + STATEMENT2);
        } else{
            points = 60;
            System.out.println(STATEMENT + points + STATEMENT2);
        }

    



        
        scan.close();

    }
}