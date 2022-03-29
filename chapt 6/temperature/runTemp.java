package temperature;
import java.util.*;

public class runTemp {
    
        /*
            ASSIGNMENT: 
                Demonstrate the temperature class by writing a seperate program that asks the user for a Fahrenheit temperature. 
                The program should create an instance of the Temperature class, with the valye entered by the user passed ot the constructor. 
                The program shoudl then call the object's method to display the temperature in Celsius and Kelvin
        */
    public static void main(String[] args) {

        // Getting user input 
            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter a number to represent the tempreture in fahreneit: ");
            double userRes = sc.nextDouble(); 

            // object
            tempInFahrenheit tempreature = new tempInFahrenheit(userRes); 
            

            // calling the Celsius method 
            double celsiusTemp = tempreature.celsius(); 
            System.out.println("Your tempreture in celsius is: " + celsiusTemp);

            // calling the Kelvin method
            double kelvinTemp = tempreature.kelvin(); 
            System.out.println("Your tempreture in Kelvin is: " + kelvinTemp);
        

            sc.close();
    }
}
