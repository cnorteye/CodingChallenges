import java.util.Random;

public class EvenOddCounter {
    
    /*
        ASSIGNMENT: Write a program with a method name isEven that accepts an int argument. The method should return true if the arugment is even, or false otherwise.
                    The program's main method should use a loop to generate 100 random integers. It should use the isEven method to determine whether each random number is even, or odd.
                    When the loop is finished, the program should display the number of even number that were generated, and the number of odd numbers.
    */


    public static void main(String[] args) {

        // Using a loop to generate 100 random intergers. 

           int evenCounter = 0;    // holds the total count of even numbers
           int oddCounter = 0;     // holds the total count of odd numbers
         
         
           for (int i = 0; i < 100; i++){
             Random rand = new Random(); 
            int num = rand.nextInt(100);
 
            
                // checking for Even or odd numbers
                    if (isEven(num)){
                            evenCounter++;

                    }else{
                        oddCounter++;
                    }

            } 
            // Printing to the console
            System.out.println();
            System.out.println("\t There were " + evenCounter + " even numbers and " + oddCounter + " odd numbers in the randomly generated numbers");
          

            
        
    }

    
    // This method return false if the number is not even
    public static boolean isEven( int x){

        if(x % 2 == 0){
            return true; 
        }

        return false; 
    }



}
