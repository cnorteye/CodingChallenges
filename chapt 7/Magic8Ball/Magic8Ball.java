

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Magic8Ball {
    public static void main(String[] args) throws IOException {
    
         // array to hold 8 ball responses from the file
        ArrayList<String> listOfResponses = new ArrayList<>();

       
            // reading file contents into an arraylist
        BufferedReader readFile = new BufferedReader( new FileReader("/Users/cnort/Documents/CSC205AB/CodingChallenges/chapt 7/Magic8Ball/responses.txt"));

       

        // read the entire line as string
        String line = readFile.readLine();

        // checking for end of file
        while (line != null){
            listOfResponses.add(line); 
            line = readFile.readLine();
        }

            

        // closing bufferedReader object
        readFile.close();

        
        //prompt user to ask a question 
        Scanner scan = new Scanner(System.in);
         // random generator
         Random randNum = new Random(); 
         int upperbound = 11;
         

            //Instuction
                    String textBlock = """
                            Do you have a burning question that you need an answer to??
                            if yes, you can consult MOJOBOO for an aswer
                            You can ask as many questions as you want.  
                            Once you are tired of asking your questions, simply type exist. 
                        """;
                    System.out.println(textBlock);


    
          // starter question  
        System.out.println("Ask MOJOBOO a question: ");  
        String response = scan.nextLine();

        // loop for user to keep asking questions until he/she wants to exist
        do {

        int randomNum = randNum.nextInt(upperbound);   
        System.out.println(listOfResponses.get(randomNum));
        System.out.println("Ask another question or enter 1 to exist");
        response = scan.nextLine();
        } while (!(response.equals("1")));
    


        System.out.println("goodbye");

       

        // closing scanner
        scan.close();
        
    }
}
