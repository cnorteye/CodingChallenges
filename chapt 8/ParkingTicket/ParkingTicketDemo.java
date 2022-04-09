public class ParkingTicketDemo {
    
    public static void main(String[] args) {

        int minutes = 200; 
        int purchasedminutes = 30; 
        
             // Establishes the Parked Car
             ParkedCar parkedCar = new ParkedCar("corolla", "Toyota", "red", "GHH3663", minutes);

             // Establishes the Parking Meter
             ParkingMeter parkingMeter =  new ParkingMeter(purchasedminutes); 


             // Establishes the police officer
             PoliceOfficer officer = new PoliceOfficer("john", "3625BA", parkedCar, parkingMeter); 
        
             // Establishes the Parking Ticket
             ParkingTicket myParkingTicket = new ParkingTicket(parkedCar, officer);

             // testing 
             //System.out.println(parkedCar.toString());
             //System.out.println(parkingMeter.toString());
             //System.out.println(myParkingTicket.toString());


                // The interaction w/ the officer and the parked car; 
             officer.checkIllegallyParked(parkedCar, parkingMeter); 
             myParkingTicket = officer.writeTicket(parkedCar, parkingMeter); 
             System.out.println(myParkingTicket.toString()); 


    }


}
