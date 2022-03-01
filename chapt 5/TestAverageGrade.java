
import java.util.Scanner;

public class TestAverageGrade {
    

    public static void main(String[] args) {
        

        /*
            Write a program that asks the user to enter five test scores.
            the program shoud display a letter grade for each score and the average test score.
            write the fellowing methods in the program: 
            calcAverage - this method should accept 5 test scores as arguments and return the averae of the scores. 
            determineGrade - this should accept a test score as a n argument and return a letter grade for the score, 
            based on the following grading scale:
        */


        // Getting user grade inputs

        Scanner sc = new Scanner(System.in);

        System.out.printf("%n%s%n", 
            "Enter 5 inter grades in the range of 0 - 100.");

        System.out.println("Enter the first grade : ");
        int gradeOne = sc.nextInt();


        System.out.println("Enter the second grade : ");
        int gradeTwo = sc.nextInt();


        System.out.println("Enter the third grade : ");
        int gradeThree = sc.nextInt();


        System.out.println("Enter the fourth grade : ");
        int gradeFour = sc.nextInt();

        System.out.println("Enter the fifth grade : ");
        int gradeFive = sc.nextInt();


        System.out.println("\t");
            determineGrade(calcAverage(gradeOne, gradeTwo, gradeThree, gradeFour, gradeFive));


        sc.close();
        
    }





    public static int calcAverage(int a, int b, int c, int d, int e){

        return (a + b + c + d + e) / 5;
    }

    public static void determineGrade( int calcAverage){

        switch (calcAverage /10){
            case 10, 9: 
                System.out.println(" Your average letter grade is A" );
                break; 
            case 8: 
                System.out.println(" Your average letter grade is B" );
                break;
            case 7: 
                System.out.println(" Your average letter grade is C" );
                break;
            default:  // below 60
                System.out.println(" Your average grade is in a FARR away county!");
                break;
        }

    }

}
