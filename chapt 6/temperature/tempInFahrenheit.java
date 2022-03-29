package temperature;


// tempreture class
public class tempInFahrenheit {
    

    // fields
    private double fahrenheit; 


    // constructor 
    public tempInFahrenheit(double ftemp){
        fahrenheit = ftemp;
    }


    
        // accessor: assigns the tempreature to fahrenheit
        public void setFahrenheit(double temp){
            fahrenheit = temp; 
        }

        // accessors: returns the fahrenheit
        public double getFahrenheit(){
            return fahrenheit; 
        }

        // method to convert the tempreture into celsius
    public double celsius(){
        return  (5/(double) 9) * (fahrenheit - 32);
    }

    // method to convert the tempreture into kelvin
    public double kelvin(){
        return (((5/ (double) 9) * (fahrenheit - 32)) + 273); 
    }



}
