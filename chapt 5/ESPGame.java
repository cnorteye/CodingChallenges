import  java.util.*;

public class ESPGame{

    /*
        ASSIGNMENT: write a program that tests your ESP (extraasensory perception). The program should randomly select the name of a color from the following list of words: 
                    red, green, blue, organge, yellow

                    To select a word, the program can generate a random number.

                    next, the program should ask the user to enter the color that the computer has selected. After the user has entered his or her guess. 
                    the program shoudl display the name of the randomly selected color. The program shoudl repeat this 10 times and then display the number of times the user correctly guessed 
                    the selected color
    */


    public static void main(String[] args) {


        // User's input
            Scanner sc = new Scanner(System.in);

        // Generating a random number
            Random rand = new Random();
            int num = rand.nextInt(5);


        // get the computer to select a color based on the randomly generated number
        

        System.out.println("You are playing a guess again with the computer. \n\t The computer will guess a color from this list TEN times: \n\t\t Red, Green, Blue, Orange, Yellow.");
        System.out.println("\t Your goal is to try and guess correctly the computer's guess; all 10 times.");
        System.out.println();



        // game 
            int counter = 0;
            for (int i = 0; i < 10; i++){
                 System.out.println("Which color did you think the COMPUTER picked? ");
                    String userResponse = sc.nextLine();

                if(userResponse.equalsIgnoreCase(computerSelectsAColor(num))){
                    counter++;
                }

            }

            reciept(counter);
        


        sc.close();
    }


        // This method lets the computer select a color based on the randomly generated number
    public static String computerSelectsAColor(int num){
        
        // array to keep the colors 
       String [] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
       return colors[num];
    }
    
    // This method returns the user's guess
    public static String getUserGuess(){
        Scanner keyboard = new Scanner (System.in); 
        System.out.println("Which color do you think the COMPUTER picked? ");
       
        String userResponse = keyboard.nextLine();
        keyboard.close();

        return userResponse;
       
       
        
    }

    public static void reciept (int counter){
        System.out.println();
            if(counter == 0 ){
                System.out.println("Better luck next time!");
            }
                System.out.println("You were able to correctly guess the computer's choice " + counter + " times");

    }


    









}