import java.util.Random;

public class Dice {
    

    // fields/ attributes

    private int sides;      // sides of the dice
    private int value;      // value of each of the sides


    /**
     * If we are creating a dice with multiple (unqiue) sides w/o using the standard six size
     * we will set up a constructor that takes in the size of the specific dice being used
     * 
     * the constructor also performs an initial roll of the die
     */

     public Dice(int numOfSides){
        sides = numOfSides;
     }

     
     /**
      * The copy constructor initializes the object as a copy of another Dice
      * @return object2 The object to copy. 
      */
      public Dice(Dice object2){
          sides = object2.sides; 
      }
      

     /**
      * getSide method
      * @return the number of sides for this dice
      */
     public int getSide(){
         return sides;
     }

     /**
      * getValue method
      * @return The value of the die.
      */

      public int getValue(){
          return value;
      }

     /**
      * Method roll
      This method stimulates rolling the dice
      @return value of the dice rolled
      */

     public int roll(){
         Random rand = new Random(); 
         value = rand.nextInt(sides) + 1; 
         System.out.println(value);
         return value;

     }

}
