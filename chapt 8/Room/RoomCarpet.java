

public class RoomCarpet {

    // field
    private double costPerSquareFoot;   // cost of carpet per sqaure foot
    private RoomDimension roomdim;      // the room dimension 


    /**
     This contructor initializes the costPerSwaureFoot and the roomdim
     
     */

     public RoomCarpet(double cost, RoomDimension dim){
            // assign cost to costPerSquareFoot
            costPerSquareFoot = cost; 

            // create a new RoomDimension object
            // passing dim as an arugment to the copy constructor. 

            roomdim = new RoomDimension(dim); 
     }

        // return cost per square foot
     public double getCostPerSquareFoot(){
            return costPerSquareFoot; 
     }

     // return a copy of the roomdimension object

     public RoomDimension getRoomDimension(){
         return new RoomDimension(roomdim); 
     }


     // method that returns the total cost of the carpet
     public double totalCost(){
        return  (roomdim.returnArea() * costPerSquareFoot);
        
     }






}
