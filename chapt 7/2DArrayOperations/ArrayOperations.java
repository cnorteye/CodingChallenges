

public class ArrayOperations {
    public static void main(String[] args) {

        int [][] testData = {{0,3,6,9}, {1,4,7,10}, {2,5,8,11} };

        //getTotal(testData); 
        System.out.println();

        //getAverage(testData);
        System.out.println();


        //getRowTotal(testData, 3);
        System.out.println();

        getColumnTotal(testData, 3);
        System.out.println();


        getHighestInRow(testData, 1);
        System.out.println();
        getLowestInRow(testData, 1);
        System.out.println();
        
    }

    public static void getTotal(int [][] x){

        final int ROW = 3; 
        final int COL = 4; 

        int total = 0; 

        for(int row = 0; row < ROW; row++){

            for(int col = 0; col < COL; col++){
                total += x[row][col];
            }
        }

        System.out.println("The total value is " + total);
    }


             public static int getTotalTwo(int [][] x){

        final int ROW = 3; 
        final int COL = 4; 

        int total = 0; 

        for(int row = 0; row < ROW; row++){

            for(int col = 0; col < COL; col++){
                total += x[row][col];
            }
        }

       return total; 
    }

    public static void getAverage(int [][] x){
            //getTotal(x);

            final int ROW = 3; 

                // computer average
            int average  = getTotalTwo(x) / 3; 

            // display 
            System.out.println("The average of the 2D Array is " + average);



           
    }


    public static void getRowTotal(int [][] x, int n){

        int subscriptOfRow = n - 1; 

        int total = 0;      // accumulator

        for (int row = 0; row < 1; row++){

            
            // sum a row. 
            for(int col = 0; col < x[subscriptOfRow].length; col++){
                total += x[subscriptOfRow][col]; 
            }

           
        } 
        // displaying the n row's total. 
            System.out.println("The total of row " + n + " is " + total);

    }


    public static void getColumnTotal(int [][] x, int n){

        int subscriptOfCol = n - 1;

        int total = 0;  // accumulator

        for(int row = 0; row < 1; row++){

                System.out.println("how may times do i iterate?");
            // sum the n colum. 
            for (int col = 1; col < x[subscriptOfCol].length; col++){
                System.out.println("how many times do i work?");
                total += x[row][subscriptOfCol];
            }

            
        }
        
        // displaying the columns's total. 
            System.out.println("The total of colum " + n + " is " + total);

    }

    public static void getHighestInRow(int [][] x, int n){

        int highNum = 0; 

        for(int row = 0; row < x.length; row++){

            for(int col = 0; col < x[n].length; col++){
                if(highNum == x[n][col]){
                    // do nothing 
                }else if(highNum > x[n][col]){
                    //do nothing
                }else {
                    highNum = x[n][col]; 
                }
            }

            // display results
            System.out.println("The highest number in row " + n + " is " + highNum);
        }

    }

    public static void getLowestInRow(int [][] x,  int n){
        int lowNum = 0; 

        for(int row = 0; row < x.length; row++){

            for(int col = 0; col < x[n].length; col++){
                if(lowNum == x[n][col]){
                    // do nothing 
                }else if(lowNum < x[n][col]){
                    //do nothing
                }else {
                    lowNum = x[n][col]; 
                }
            }

            // display results
            System.out.println("The lowest number in row " + n + " is " + lowNum);
        }
    }






}
