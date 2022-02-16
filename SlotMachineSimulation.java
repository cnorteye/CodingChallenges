
import java.util.Random;
import java.util.Scanner;

public class SlotMachineSimulation {

    public static void main(String[] args) {

        /*
            Assignment: create a program that simulates a slot matchine.  When the program runs, it should do the following: 
            1. asks the user to enter the amount of money he or she wants to enter into the slot machine. 
            2. instead of displaying images, the program will randomly select a word from the following list: 
                Cherries, Oranges, Plums, Bells, Melons, Bars
            To select a word, the program can generate a random number in the range of 0 through 5. If the number is 0, the selected word is Cherries; 
            if the number is 1, the selected word is oganages; and so forth.
            the program should randomly select a word from this list three times and display all three of the words. 
            4. if none of the randomly selected words match, the program will information the user that he or she has won $0. If two of the words match, 
            the program will information the user he or she
            has won two times the amount entered. If three of the words match, the program will inform the user he or she has won threee times the amount entered. 
            5. The program will ask whether the user wants to play again. 
            if so, these steps are repeated. if not, the programs displays the total amount of money entered into the slot machine and the total amount own. 
        */
        
        SlotMachine obj1 = new SlotMachine(); 
        obj1.userInput();

    }
    
}


class SlotMachine{

   

    String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
    int number;
    int randomWords;
    int matchCounter = 0;
    String[] displayWords = new String[3];
    String answer;
    
         
        

        void userInput(){
            
            Scanner keyboard = new Scanner(System.in); 
           


            //Scanner playAgain = new Scanner(System.in); 

            // Create a Random class object. 
                Random randomNumbers = new Random();

                do {
                    System.out.println();
                    System.out.println("Enter a $$ amount into the slot machine");
            
                    double userAnswer = keyboard.nextDouble();
                    System.out.println("\n");


                    for ( int i = 0; i < 3; i++){
                        number = randomNumbers.nextInt(5);         // generating a random number from 0 - 5
                        
                        for(int j = 0; j < words.length; j++){
                            
                            
                            if(number == j){
                                System.out.print(words[j] + ", ");
    
                                // add words into a new array
                                int s = 0;
    
                                while( s < displayWords.length){
                                    displayWords[i] = words[j];
                                    s++;
    
                                     //System.out.println(displayWords[i] + " I want to see how many times you print ");
                                     //System.out.println();
                                }
                                    
    
    
    
                                
    
                            }
                            
                            
                        } //System.out.println(Arrays.toString(displayWords));
                    
                     
                 }
                 
    
    
    
                 // check for how many words are duplicated in the new array
    
                 for(int z = 0; z < displayWords.length; z++){
                    for(int y = z + 1; y < displayWords.length; y++ ){
                        if(displayWords[z].equals(displayWords[y])){
                               matchCounter++;
    
                               //System.out.println(matchCounter + " is this even printing? ");
                        }
                    }
                }
    
    
    
                // print out the answer based on how many words matach
    
                if(matchCounter == 0){
                    System.out.println();
                    System.out.println("\n----------------------------------------");
                    System.out.println("Sorry, you have won $0 dollars!");
                    System.out.println();
                } else if (matchCounter > 0){
                    //int newMatachCounter = matchCounter+1; 
                    Double amountWon = matchCounter * userAnswer;
                    System.out.println(" \n=========================================");
                    System.out.println();
                    System.out.println(" Yaayyyy, you have won $ " + amountWon + " dollars!");
                }
    
    
    





                // Does the user want to play the game again? 

                System.out.println("Do you want to play again? Enter yes or no:");
                System.out.println();
                answer = keyboard.next();







                
                } while (answer.equals("yes"));
             


                



             keyboard.close();
             //playAgain.close();
             

        }

     








}