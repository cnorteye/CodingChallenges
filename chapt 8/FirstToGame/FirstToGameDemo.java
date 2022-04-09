
public class FirstToGameDemo {
    
    public static void main(String[] args) {

        // constants 
        final int NUM_OF_SIDES = 6;
        final int POINTS = 50; 

        // instance of the dice object
        Dice die = new Dice(NUM_OF_SIDES); 
        
        // instances of the player object
        Player player1 = new Player(die, POINTS); 
        Player player2 = new Player(die, POINTS); 

        Game game = new Game(die, player1, player2, POINTS); 
        game.gameTime();

        


    }
}
