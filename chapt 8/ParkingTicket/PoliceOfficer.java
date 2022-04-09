import java.text.DecimalFormat;

public class PoliceOfficer {
    
    // fields
    private String name;        //name
    private String badgeNumber;     // badge number
    private ParkedCar parkedCar; 
    private ParkingMeter parkingMeter; 
    private ParkingTicket parkingTicket; 
    double fine; 



    // constructor
    public PoliceOfficer(String poName, String pobNumber, ParkedCar pCar, ParkingMeter pMeter)
    {
        name = poName; 
        badgeNumber = pobNumber; 
        this.parkedCar = pCar; 
        this.parkingMeter = pMeter; 
        //this.parkingTicket = parkingTicket; 
    }

    // setter
        public void setName(String poName){
            name = poName; 
        }

        public void setBadge(String pobNumber){
            badgeNumber = pobNumber; 
        }


        //public void setFine(double f){
           // fine = f; 
       // }

      // getter
      public String getName(){
        return name; 
    }

    public String getBadge(){
       return badgeNumber; 
    }


    //public double getFine(){
      //  return fine;
    //}

    // copy constructor
        public PoliceOfficer(PoliceOfficer object2){
            name = object2.name; 
            badgeNumber = object2.badgeNumber; 
        }

    // referenced copy of ParkedCar 
    public ParkedCar getParkedCar(){
        return new ParkedCar(parkedCar); 
    }

    // referenced copy of ParkingMeter
    public ParkingMeter getParkingMeter(){
        return new ParkingMeter(parkingMeter); 
    }

    // referenced copy of ParkingMeter
    public ParkingTicket getParkingTicket(){
        return new ParkingTicket(parkingTicket); 
    }


    public boolean checkIllegallyParked(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        //int mins = car.getMinutesParked() - minutes.getMinutesPurchased();
        if (parkedCar.getMintues() > parkingMeter.getMinutesPurchased()) {
            return true;
        } else {
            return false;
        }
    }

    public ParkingTicket writeTicket(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        ParkingTicket ticket = new ParkingTicket(parkedCar, this);
        int remainingMinutes = parkedCar.getMintues()- parkingMeter.getMinutesPurchased();
        
        if (checkIllegallyParked(parkedCar, parkingMeter)) {
            if (remainingMinutes <= 60){
                ticket.fine = 25;
            } else{
                ticket.fine = 25 + (10 * ((double) remainingMinutes / 60));
            }
            //return ticket;
        }
        return ticket;
    }
    

    
}
