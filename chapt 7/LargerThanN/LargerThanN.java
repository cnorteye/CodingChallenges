package LargerThanN;

import java.util.Random;
import java.util.Scanner;

public class LargerThanN {

    public static void main(String[] args) {

        // we will get the user to determine the size of the array
            Scanner keyboard = new Scanner(System.in); 
            System.out.println("Enter a number (0 - 10) to determine the size of the array ");
            int size = keyboard.nextInt();

       // array
            int []testNum = new int[size];

        // random number generator
            Random randNum = new Random();      // instance of the random class
            int upperbound = 100;               // limit of number to generate

        // loop
            for(int i = 0; i < testNum.length; i++){
                // assign the random number into the array
                testNum[i] = randNum.nextInt(upperbound);
            }
        

        // Ask the user to give us a number
            System.out.println("Give us a number ");
            int num = keyboard.nextInt();

        // calling the method
            returnLargeNumber(testNum, num); 

        // close scanner
        keyboard.close();

    }



        // this method will return all numbers that are larger than n
    public static void returnLargeNumber(int [] number, int n){

        System.out.print("This number (s) "); 
        
        for(int index = 0; index < number.length; index++){
            if(n < number[index]){
                System.out.print(number[index] + " ");
            }
        }

        System.out.print(" are large than your number " + n); 
    }
    
}
