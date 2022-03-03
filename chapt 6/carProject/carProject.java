package carProject;

public class carProject {
    
    /* 
        ASSIGNMENT: 
            Demonstrate the class in a program that create a CAR object, and then calls the accelerate method 5 times. after each call to the accelerate method, 
            get the current speed of the car and display it. 
            Then call the brake method 5 fives. After each call tot he brake method, get the current speed of the car display it. 
    */
    public static void main(String[] args) {

        // Car object 
        Car myCar = new Car(2014, "corolla");

        // variables
        int carSpeed; 
        int times = 5;

        System.out.println();

        //loop to call the accelarate method
            for(int i = 0; i < times; i++){
                myCar.accelerate();
                System.out.print("Voommm.... ");
            }
            // car speed after accelarating
            carSpeed = myCar.getSpeed();            
            System.out.println("\n\tCurrent speed: " + carSpeed);

        

            // calling the brake method 
            for(int i = 0; i < times; i++){
            myCar.brake();
            System.out.print("Braaaakkkkk...."); 
        }

        // car speed after car brakes
        
        carSpeed = myCar.getSpeed();
        System.out.println("\n\tCurrent speed: " + carSpeed);
    }
}



