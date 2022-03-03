package roulettewheelcolors;

public class RoulettePocket {


    private String pocketColor; //Color of the pocket
    private String pocketNumber; //Number of the pocket
    private int pocketInt; //convert String pocketNumber to Int

        // constructor
    public RoulettePocket(String pocket){
         pocketNumber = pocket;

    }

    public String zeroRange(){

        pocketInt = Integer.parseInt(pocketNumber);

        if (pocketInt == 0){
            pocketColor = GREEN;
        }

        return pocketColor;
    }


    //getPocketColor method, return the pocket color.
    
    public String oneAndTenRange(){

        pocketInt = Integer.parseInt(pocketNumber);
        if ((pocketInt >= 1) && (pocketInt <= 10)){

            if ((isEven(pocketInt)) && (pocketInt > 0)){
                pocketColor = BLACK;
            }
                else if ((pocketInt > 0) && (isOdd(pocketInt))){
                pocketColor = RED;
            }
            else {pocketColor = GREEN;}
        }

        return pocketColor;
    }


    public String elevenAndEighteenRange(){
        
        //      logicTest();

       pocketInt = Integer.parseInt(pocketNumber);

       if ((pocketInt >= 11) && (pocketInt <= 18)){
           if ((pocketInt % 2 == 0) && (pocketInt > 0)){pocketColor = RED;}
           else if ((pocketInt > 0) && (pocketInt%2!=0)){
               pocketColor = BLACK;
           }
           else {pocketColor = GREEN;}
       }

       return pocketColor;
   }


   public String nineteenAndTwentyEightRange(){
        
    //      logicTest();

   pocketInt = Integer.parseInt(pocketNumber);

   if ((pocketInt >= 19) && (pocketInt <= 28)){

       if ((pocketInt % 2 == 0) && (pocketInt > 0)){
           pocketColor = BLACK;
        }
       else if ((pocketInt > 0) && (pocketInt%2!=0)){
           pocketColor = RED;
       }
       else {pocketColor = GREEN;
    }
}


   return pocketColor;
}


        public String twentyNineAndThirtyNineRange(){
                
            //      logicTest();

        pocketInt = Integer.parseInt(pocketNumber);

        if ((pocketInt >= 29) && (pocketInt <= 36)){
            if ((pocketInt % 2 == 0) && (pocketInt > 0)){pocketColor = RED;}
            else if ((pocketInt > 0) && (pocketInt%2!=0)){
                pocketColor = BLACK;
            }
            else {
                pocketColor = GREEN;
            }
        }

        return pocketColor;
        }


        public String getPocketColor(){

        pocketInt = Integer.parseInt(pocketNumber);
        zeroRange();
        oneAndTenRange();
        elevenAndEighteenRange();
        nineteenAndTwentyEightRange();
        twentyNineAndThirtyNineRange();

        return pocketColor;

        
        }




 // METHOD TO CHECK FOR EVEN OR ODD NUMBER
    public boolean isEven(int pocketInt){

        if ((pocketInt % 2) == 0){
            return true;
        }
        return false;
    }

    // METHOD TO CHECK FOR EVEN OR ODD NUMBER
    public boolean isOdd(int pocketInt){
        
        if(pocketInt % 2 != 0)
            return true;

        return false;

    }
           


 // constants
    static final String BLACK = "black"; 
    static final String GREEN = "green"; 
    static final String RED = "red"; 




    }



