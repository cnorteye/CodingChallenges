public class Game {

    // attributes/ fields
    private Dice die; 
    private Player player1; 
    private Player player2; 
    int point;

     


    /**
     * This constructor initializes the fields
     */

     public Game (Dice die, Player player1, Player player2, int p){
        //create an new Dice & Player object, passing in their arguments as a copy constructor
        this.die = die; 
        this.player1 = player1; 
        this.player2 = player2;
        point = p;


     }

     /**
      * getDice method 
      @return A reference to a copy of Dice method
      */

        public Dice getDice(){
            return new Dice(die); 
        }


      /**
       * getPlayer method
       * @return A reference to a copy of the Player 1 
       */

       public Player getPlayerOne(){
           return new Player(player1);
       }

       public Player getPlayerTwo(){
        return new Player(player2);
    }

    public int getPoint(){
        return point;
    }


    /**
     * 
     */

     public void gameTime(){
      
        if(player1.playerRollingTheDice()  == player2.playerRollingTheDice()){
            System.out.println("This is a tie");
        }
        else if(player1.playerRollingTheDice() < player2.playerRollingTheDice()){
             System.out.println("Player one won");
        }else{
            System.out.println("Player two won!");
        }
           
    

     }


    
}
