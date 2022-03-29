
import java.util.Random;
import java.util.Scanner;

public class RPCGame {

        /*
            ASSIGNMENT: Write a program that lets the user play the game of Rock, Paper, Scissors against the computer.

        */

    public static void main(String[] args) {

        // getting user response
            Scanner keyboard = new Scanner(System.in);
             
           char attempt = ' '; 

            do {

                // printing to console 

                System.out.println();
             System.out.println("Let's play rock, paper, scissors against a computer. \n\t To play, enter a number between 1 and 3. \n\t 1 = rock; 2 = paper and 3 = scissors. \n\n\t Let's begin: Enter your number!");
 
             //user input
             int userRes = keyboard.nextInt(); 
               

            // variables for the random generator
            int max = 3; 
            int min = 1; 


                // generating a random number from 1 = 3
                    Random rand = new Random(); 
                    int rand_int = rand.nextInt(max - min + 1) + min; 

                     //System.out.println(rand_int);
                     

                     // printing out both the user and computer's choice
                 userChoice(userRes);
                 computerChoice(rand_int);

                // plays the game
                    game(userRes, rand_int);
                    System.out.println();


                    // if both the user and computer chooses the same number; ask the user if he wants to play again
                                    if(userRes == rand_int){               
                                        System.out.println();
                                        System.out.println(" Tie!");
                                        System.out.println("\n\t");
                                        System.out.println("Do you want to play again? Enter y/Y or n/N");
                                        attempt = keyboard.next().charAt(0);            // assigns the user's response into attempt
                                        

                                        
                                    }else {                 // asking the user if they want to play again regardless of whether there is a tie or not. 
                                                            // this is because only asking it if there is tie causes the game to go on until there is another tie    

                                        System.out.println();
                                        System.out.println("Do you want to play again? Enter y/Y or n/N");
                                        attempt = keyboard.next().charAt(0);            // assigns the user's response into attempt
                                    }
                

                 

            } while (attempt == 'y' || attempt == 'Y');             // while user says y, to playing again, 
            
            System.out.println();
            System.out.println("Thank you for playing");
            
          







            keyboard.close();



        
    }

    // method for user's choice 

    public static void userChoice(int num){
        
        switch(num){
            case 1: 
                System.out.println("Your choose Rock!");
                break; 
            case 2: 
                System.out.println("You choose Paper!");
                break; 
            case 3: 
                System.out.println("You choose Scissors!");
                break;
            default: 
                System.out.println("You broke the game! Choose a NEW number between 1 - 3");
        }
    }
    

    // method for computer's choice 
    public static void computerChoice(int num){
        
        switch(num){
            case 1: 
                System.out.println("Computer choose Rock!");
                break; 
            case 2: 
                System.out.println("Computer choose Paper!");
                break; 
            case 3: 
                System.out.println("Computer choose Scissors!");
                break;
            default: 
        }
    }

    // constants
    private static final String YOUWON = "You won!";
    private static final String COMPUTERWON = "Computer won!";


    public static void game (int userRes, int rand_int){
        System.out.println();
        if (userRes == 1 && rand_int == 2){               // user played rock (1)  && computer played paper (2)
            System.out.println("Paper covers Rock: ");
            System.out.print(COMPUTERWON);
        } else if (userRes == 1 && rand_int == 3){               // user played rock (1) && computer played scissors (3)
            System.out.println("Rock smashes the scissors: ");
            System.out.print(YOUWON);
        } else if (userRes == 2 && rand_int == 1){                        // user played paper (2) && computer played rock (1)
            System.out.println("Paper covers Rock: ");
            System.out.print(YOUWON);
        }else if(userRes == 3 && rand_int == 2 ){                        // user played scissors (3) && computer played paper (2)            
            System.out.println("Scissors cuts paper: ");
            System.out.print(YOUWON);
        }else if(userRes == 3 && rand_int == 1){                        // user played scissors (3)  && computer played rock (1)
            System.out.println("Rock smashes the scissors");
            System.out.print(COMPUTERWON);
        }else if(userRes == 2 && rand_int == 3){                        // user played paper (2)  && computer played scissors (3)
            System.out.println("Scissors cuts paper: ");
            System.out.print(COMPUTERWON);
        }else{                                           
        }

    }



}