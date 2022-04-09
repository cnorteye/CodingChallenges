public class RoomDimension {
    // fields

    private double lenght; 
    private double width;

    /**
     * This constructor initializes the length and width 
     * @param len length of the room
     * @param w width of the room
     */

     public RoomDimension(double len, double w){
         lenght = len; 
         width = w; 
     }


     /** 
      
        the copy constructor initializes the object as a copy of another 
        RoomDimension object
      */

      public RoomDimension(RoomDimension object2){
        lenght = object2.lenght; 
        width = object2.width; 
      }

      

    public double setLenght(double len){
        lenght = len; 
        return lenght; 
    }

    public double setWidth(double w){
        width = w; 
        return width; 
    }

    // method that returns the area

    public double returnArea(){
        return width * lenght; 
    }
}
