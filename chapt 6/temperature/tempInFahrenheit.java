package temperature;

public class tempInFahrenheit {
    

    // fields

    private double fahrenheit; 


    // constructor 
    public tempInFahrenheit(double ftemp){
        fahrenheit = ftemp;
    }

    // accessors

    public void setFahrenheit(double temp){
        fahrenheit = temp; 
    }

    public double getFahrenheit(){
        return fahrenheit; 
    }

    public double celsius(){
        return  (5/(double) 9) * (fahrenheit - 32);
    }

    public double kelvin(){
        return (((5/ (double) 9) * (fahrenheit - 32)) + 273); 
    }



}
