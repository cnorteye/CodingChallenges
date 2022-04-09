

public class ParkingMeter {

    // fields
    private int minutesPurchased;    // number of minutes of parking time

    // constructor 
    public ParkingMeter(int pmPurchased){
        minutesPurchased = pmPurchased;
    }

    //setters
    public void setMinutesPurchased(int pmPurchased){
        minutesPurchased = pmPurchased; 
    }


    // copy constructor 
    public ParkingMeter(ParkingMeter object2){
        minutesPurchased = object2.minutesPurchased; 
    }
    

    // getter
    public int getMinutesPurchased(){
        return minutesPurchased;
    }

    public String toString(){
        String str = "The purchased number of parking time is: " + minutesPurchased; 

       return str; 
    }

}
