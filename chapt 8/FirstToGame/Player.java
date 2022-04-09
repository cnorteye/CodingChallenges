public class Player {
    
   // fields/ attributes
   private int points;      // points the player has     
   Dice die;                // object of the Dice 
       



   /**
    * This constructor  
    */
   public Player(Dice die, int p){
       //name = n;
       this.die = die;
       points = p;
   }

   /**
      * The copy constructor initializes the object as a copy of another Dice
      * @return object2 The object to copy. 
      */
      public Player(Player object2){
        points = object2.points;
    }

    /**
     * The set method sets a vaule for each field. 
     * @param points The total stating points the player has
     */

     public int set(){
         return points;
     }



     public int playerRollingTheDice(){
        int nPoint = 0; 
        nPoint = (points - die.roll()); 

        // if statement
        if(nPoint == 1){

        }else if(nPoint < 1){
            nPoint += points - die.roll();
        }else{
            nPoint -= points - die.roll();
        }

        return nPoint; 


    }


            
 }

     
   
