package roulettewheelcolors;



// class
public class RoulettePocket {


    private String pocketColor; //Color of the pocket
    private String pocketNumber; //Number of the pocket
    private int pocketInt; //convert String pocketNumber to Int

        // constructor
    public RoulettePocket(String pocket){
         pocketNumber = pocket;

    }

        // method to check for pocket of 0
    public String zeroRange(){

        pocketInt = Integer.parseInt(pocketNumber);

        if (pocketInt == 0){
            pocketColor = GREEN;
        }

        return pocketColor;
    }


    //getPocketColor method, return the pocket color.
    // method to check for pocket 1 to 10 
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


    // method to check for pocket 11 to 18
    public String elevenAndEighteenRange(){

       pocketInt = Integer.parseInt(pocketNumber);

       if ((pocketInt >= 11) && (pocketInt <= 18)){
           if ((isEven(pocketInt)) && (pocketInt > 0)){pocketColor = RED;}
           else if ((pocketInt > 0) && (isOdd(pocketInt))){
               pocketColor = BLACK;
           }
           else {pocketColor = GREEN;}
       }

       return pocketColor;
   }


                // method to check for pocket number 19 to 28
            public String nineteenAndTwentyEightRange(){
                    


                    pocketInt = Integer.parseInt(pocketNumber);

                    if ((pocketInt >= 19) && (pocketInt <= 28)){

                        if ((isEven(pocketInt)) && (pocketInt > 0)){
                            pocketColor = BLACK;
                            }
                        else if ((pocketInt > 0) && (isOdd(pocketInt))){
                            pocketColor = RED;
                        }
                        else {pocketColor = GREEN;
                        }
                    }


                    return pocketColor;
            }


            // method to check for pocket number 29 to 39

        public String twentyNineAndThirtyNineRange(){
                

                pocketInt = Integer.parseInt(pocketNumber);

                if ((pocketInt >= 29) && (pocketInt <= 36)){

                    if ((isEven(pocketInt)) && (pocketInt > 0)){
                        pocketColor = RED;
                    }
                    else if ((pocketInt > 0) && (isOdd(pocketInt))){
                        pocketColor = BLACK;
                    }
                    else {
                        pocketColor = GREEN;
                    }
                }

                return pocketColor;
        }


        // main logic
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



