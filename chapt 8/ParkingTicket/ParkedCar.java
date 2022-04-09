

public class ParkedCar {
    
    // fields
    private String make; 
    private String model; 
    private String color; 
    private String licenseNumber;      // licence number
    private int minutes; 


        // contructor
    public ParkedCar(String pcmake, String pcmodel, String pccolor, String pclnumber, int pcminutes) {
        make = pcmake; 
        model = pcmodel;
        color = pccolor; 
        licenseNumber = pclnumber; 
        minutes = pcminutes; 
    }

    
  
     
    // Setters
            public void setMake(String pcmake) {
                make = pcmake;
            }

            public void setModel(String pcmodel) {
                model = pcmodel; 
            }

            public void setColor(String pccolor) {
                color = pccolor;
            }

            public void setlicenseNumber(String pclnumber) {
                licenseNumber = pclnumber;
            }

            public void setMintues(int pcminutes) {
                minutes = pcminutes; 
            }



    // getters
    public String getMake() {
       return make; 
    }

    public String getModel() {
        return model; 
    }

    public String getColor() {
        return color;
    }

    public String getlicenseNumber() {
        return licenseNumber;
    }

    public int getMintues() {
        return minutes;  
    }

    // copy constructor
    public ParkedCar (ParkedCar object2){
        make = object2.make; 
        model = object2.model; 
        color = object2.color; 
        licenseNumber = object2.licenseNumber; 
        minutes = object2.minutes; 
    }

    /**
     * toString methid 
     * @return string
     */

     public String toString(){
         String str = "Parked car's make: " + make +
                        "\nParked car's model: " + model + 
                        "\nParked car;s color: " + color +
                        "\nParked car's license plate number: " + licenseNumber +
                        "\nMinutes that the car has been parked: " + minutes; 

        return str; 
     }


     
}
