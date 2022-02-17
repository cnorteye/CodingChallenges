import java.util.Scanner;
import java.io.*;


public class UppercaseFileCoverter {
    public static void main(String[] args) throws FileNotFoundException {

        /*
            ASSIGNMENT: Write a program that asks the user for the names of two files.
            The first file should be opened for reading and the second file should be opended for writing.
            The program should read the contents of the first file, change all characters to uppercase, and store the results in the second file.
            The second file will be a copy of the first file, except that all the characters will be uppercase. 
        */
        

        String readFile;    // 1st file name
        String writeFile;   // 2nd file name
        String line;         // this will hold each line of text as we read it
        String my_line = " ";         // this will hold the UpperCase text from the readfile

        // create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

                // Get 2 file name from user
                System.out.println("Enter the names for 2 different files: ");
                readFile = keyboard.nextLine();
                writeFile = keyboard.next();


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(readFile));
                writer.write("This is a test. "); 
                writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    

        // creating instances of the 2 files
        PrintWriter inputFile = new PrintWriter(writeFile);
        inputFile.close();


            // reading the contents of the READ file and change it to uppercase
            // opening the file again
        try (BufferedReader reader = new BufferedReader(new FileReader(readFile))) {
                 

                while( (line = reader.readLine()) != null){
                    // changing line inside readFile into upperCase
                     my_line = line.toUpperCase();
                }
           
           reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

            // write  the upperCase sentence into the second file
        try {
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(writeFile));
                writer2.write(my_line); 
                System.out.println("check your second file");

                writer2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        


        // closing the scanners
        keyboard.close();
        


    }
    
}
