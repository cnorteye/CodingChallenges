
import java.io.*;
import java.util.Scanner;

public class LetterCouter {
    public static void main(String[] args) throws IOException{
        

        String fileName;    // file name

        // create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);


        // Get file name from user
        System.out.println("Enter the filename: ");
        fileName = keyboard.nextLine();

        // open the file
        PrintWriter outputFile = new PrintWriter(fileName);

        System.out.println("Write a random sentence into the file: ");
        outputFile.println(keyboard.nextLine());
        
        outputFile.close();


          // opening the file again
        File file = new File (fileName);

        // reading the contents of the file into a string
        Scanner fileContents = new Scanner(file);
        String lineInFile = fileContents.nextLine();

        //System.out.println(lineInFile);


        // Get a character from the user
        System.out.println();
        System.out.println("Enter a character: anything from a - z");
        char userCharInput = keyboard.next().charAt(0);

        // checking how many time the character from the user input appears inside the sentence of the file
        int count = 0;

        for(int i = 0; i < lineInFile.length(); i++)
        {
            if(lineInFile.charAt(i) == userCharInput)
            {
                count++;
            }
        }
        System.out.println();
        System.out.println("Your character : " + userCharInput + " shows up in your sentence " + count +  " times");
    


        // closing the scanners

        fileContents.close();

        keyboard.close();
        
    }
    
}

