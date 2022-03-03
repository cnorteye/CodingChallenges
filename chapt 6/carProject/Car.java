package carProject;

public class Car {

        // fields
        private int yearModel; 
        private int speed; 
        private String make;
        
    
        // constructor
        public Car(int y, String m){
            yearModel = y; 
            make = m;
            speed = 0;
        }
    
    
        // Accessors: should get the values stored in an object's yearModel, make and speed fields
        
        public String getMake(){
            return make;
        }
    
        public int getYearModel(){
            return yearModel;
        }
    
        public int getSpeed(){
            return speed;
        }
    
       
        // accelarate method, should add 5 to the speed field each time it is called
        public void accelerate(){
            speed+=5;
        }
    
        // brake method: subtract 5 from the speed field each time it is called
        public void brake(){
            speed-=5;
        }
    
    }