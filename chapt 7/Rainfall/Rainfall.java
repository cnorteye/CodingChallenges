package Rainfall;
import java.util.Scanner;

public class Rainfall {
    // fields
    public static final int SIZE = 12; 
    double [] monthlyRain = new double [SIZE];
    String [] month = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    

    // constructor
    public Rainfall(){

    }


    /* 
        This method to get the rainfall amount for each of the months from the user using the Scanner object
    */
    public void getRainFall(){
        Scanner reader = new Scanner(System.in);    // Create a Scanner object 

        for(int i = 0; i < monthlyRain.length; i++){
           System.out.println("Enter the rain fall " + month[i]);
           monthlyRain[i] = reader.nextDouble();
           
           // input validation
           if (monthlyRain[i] < 0.0) {
            System.out.println(" Do not accept negative numbers for monthly rainfall figures!!");
            System.out.println(" Enter new figure ");
            monthlyRain[i] = reader.nextDouble();

        }

        }

        reader.close();

    }
    


    // method: return the total rainfall for the year
    public void totalRain(){
        double total = 0;
        for(int i = 0; i < monthlyRain.length; i++){
            total += monthlyRain[i];
        }

        System.out.println(" The total rainfall for the year is: " + total);
    }

   

    // method: return the average monthly rainfall
    public void averageMonth(){
        double result = 0;  
        int average = SIZE;

        // calculate the total month
        for(int i = 0; i < monthlyRain.length; i++){
            result += monthlyRain[i];
        }

      double averageResult =  result / average; 

      System.out.println("The average monthly rainfall is: " + averageResult);
        

    }


    // method: the month with the most rain

    public void mostRainFall(){
        double higherRainfall = 0.0;         // comparing number
        int counter = 0;                   

        for(int i = 0; i < monthlyRain.length; i++){
            // loop through the array of rainfalls and check to see which one is the highest 

                // check it is the same number 
                if (higherRainfall == monthlyRain[i]){
                    // do nothing
                }else if (higherRainfall > monthlyRain[i]){             // if most is less than the monthlyrain amount, then assign the monthly rain to mount
                    // do nothing
                }else{
                    higherRainfall = monthlyRain[i];
                    counter = i;
                }
              

        }
        System.out.println( month[counter] + " had the HIGHEST rain fall at: " + higherRainfall );

    }

    // method: the month with the least rain
    public void leastRainFall(){
        double lowestRainfall = 1000;         // comparing number
        int counter = 0; 

        for(int i = 0; i < monthlyRain.length; i++){
            // loop through the array of rainfalls and check to see which one is the highest 

                // check it is the same number 
                if (lowestRainfall == monthlyRain[i]){
                    // do nothing
                }else if (lowestRainfall < monthlyRain[i]){             // if lowest is smaller than the rain fall
                    // do nothing
                }else{                                              // if lowest is higher than the rain fall
                    lowestRainfall = monthlyRain[i];
                    counter = i;
                }

        }
        System.out.println( month[counter] + " had the LOWEST rainfall at: " + lowestRainfall );
    }
}
