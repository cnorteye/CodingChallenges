import java.text.DecimalFormat;

public class ParkingTicket {
    
    // fields
    double fine; 
    private ParkedCar parkedCar; 
    private ParkingMeter parkingMeter;
    private PoliceOfficer policeOfficer; 

    // constructor
    public ParkingTicket(ParkedCar parkedCar, PoliceOfficer policeOfficer) {
        this.parkedCar = parkedCar;
        this.policeOfficer = policeOfficer;
        this.parkingMeter = parkingMeter;
    }

    

     // copy constructor 
     public ParkingTicket(ParkingTicket object2){
        fine = object2.fine; 
    }
        // getters & setters
    public ParkedCar getCar() {
        return parkedCar;
    }

    public void setCar(ParkedCar parkedCar) {
        this.parkedCar = parkedCar;
    }

    public PoliceOfficer getCop() {
        return policeOfficer;
    }

    public void setCop(PoliceOfficer policeOfficer) {
        this.policeOfficer = policeOfficer;
    }

    public ParkingMeter getParkingMeter() {
        return parkingMeter;
    }

    public void setParkingMeter(ParkingMeter parkingMeter) {
        this.parkingMeter = parkingMeter;
    }
    
    public void setFine(double f)   {
        fine = f; 
    }

    public double getFine() {
        return fine; 
    }


        // toString Method
    public String toString(){
        DecimalFormat d = new DecimalFormat("$#,###,##0.00");

        String str;
        str = "Make: " + parkedCar.getMake() + "\nModel: " + parkedCar.getModel() + "\nColor: " + parkedCar.getColor() + "\nLicense Number: " + parkedCar.getlicenseNumber()+
                "\nFine: " + d.format(fine)+"\nOfficer Name: " + policeOfficer.getName() + " (Badge # "+ policeOfficer.getBadge()+")";
        return str;
    }


}
