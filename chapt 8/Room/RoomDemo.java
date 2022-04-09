public class RoomDemo {
    /**
        This program demonstrates the room dimension + room carpet class
     */

     public static void main(String[] args) {
         
            // Create an RoomDimension object

            RoomDimension dimension = new RoomDimension(12, 10); 


            // Create a RoomCarpet obect
            RoomCarpet carpet = new RoomCarpet(8, dimension); 

            // display the total cost 
            System.out.println("$" + carpet.totalCost()); 
     }
}
