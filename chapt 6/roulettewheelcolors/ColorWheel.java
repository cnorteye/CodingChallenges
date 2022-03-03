package roulettewheelcolors;

import java.util.*;

public class ColorWheel {
    

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease provide a pocket number between 0 and 36: ");
        String userPocketNumber = input.nextLine();
        //String userPocketColor ="";
        int pocketNumberInt;

        pocketNumberInt = Integer.parseInt(userPocketNumber);

        while (pocketNumberInt >= 0  && pocketNumberInt <= 36){
        RoulettePocket rouletteObject = new RoulettePocket(userPocketNumber);
        System.out.println("\n" + YOUENTERED + userPocketNumber + " which is the color " + rouletteObject.getPocketColor());
            System.out.print("\n" + PLAYAGAIN);
            userPocketNumber = input.nextLine();
            pocketNumberInt = Integer.parseInt(userPocketNumber);
                    if(pocketNumberInt == 99){
                        System.exit(0);
                    }
        }

        while ((pocketNumberInt < 0)  || (pocketNumberInt > 36)){
            System.out.println("\n " + YOUENTERED + pocketNumberInt+ " which is not valid. Please enter a number between 0 and 36.");
            System.out.println("\nPlease provide a pocket number or enter 99 to quit: ");
            userPocketNumber = input.nextLine();
            pocketNumberInt = Integer.parseInt(userPocketNumber);
            RoulettePocket rouletteObject = new RoulettePocket(userPocketNumber);
            if(pocketNumberInt == 99){
                System.exit(0);

        }
                 while (pocketNumberInt >= 0  && pocketNumberInt <= 36){
                 rouletteObject = new RoulettePocket(userPocketNumber);
                        System.out.println("\n" + YOUENTERED + userPocketNumber + " which is the color " + rouletteObject.getPocketColor());
                        System.out.print(PLAYAGAIN);
                        userPocketNumber = input.nextLine();
                        pocketNumberInt = Integer.parseInt(userPocketNumber);

                            if(pocketNumberInt == 99){
                                System.exit(0);
                            }
            }




        }
    
        input.close();
    }






// constants
static final String YOUENTERED = "You entered the number "; 
static final String PLAYAGAIN = "Please provide a pocket number to play again or enter 99 to quit:  ";







        
        
    }

