
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GradeBook{

    // fields
    ArrayList<String> studentNames = new ArrayList<>(); 
        // 5 arrays for each student's test score
    static final int SIZE = 4; 
    static final int STUDENT = 5; 
    double [] studentOne = new double [4]; 
    double [] studentTwo = new double[SIZE]; 
    double [] studentThree = new double[SIZE]; 
    double [] studentFour = new double[SIZE]; 
    double [] studentFive = new double[SIZE]; 
        // array for letter grade
    char [] gradeLetter = {'A', 'B', 'C', 'D', 'F'};

    double [] averageStudentScore = new double [STUDENT];


    // no args constractor
        public GradeBook(){

        }

    // Get the student name
    public void setStudentNames(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Five names of your students");

            // loop to get the student names
        for(int index = 0; index < STUDENT; index++){
             String name = keyboard.nextLine();
             studentNames.add(name); 
        }

        //System.out.println(studentNames);
    }



        // Set the students name; method will return the students names
        public ArrayList<String> getStudentNames(ArrayList<String> sNames){
           Collections.copy(studentNames, sNames); 
           return sNames;  
        }


        // Method that asks the user to give us  each of thier 4 test scores
                public void setTestScores(){
                    int i = 0;
                    Scanner scan = new Scanner(System.in); 

                    

                /*
                    Loop to iterate through all 5 of the students names; get the 4 test scores for each student. 
                    and store it in their respective array
                */
                            while(i < STUDENT){
                                System.out.println("Enter the Four test scores for " + studentNames.get(i)); 
                                    for(int j = 0; j < SIZE; j++){
                                                    double score = scan.nextDouble();
                                                    if(i == 0){
                                                        studentOne[j] = score;
                                                    }else if(i == 1){
                                                        studentTwo[j] = score;
                                                    }else if(i == 2){
                                                        studentThree[j] = score;
                                                    }else if(i == 3){
                                                        studentFour[j] = score;
                                                    }else{
                                                        studentFive[j] = score;
                                                    }
                                                    
                                                }
                                i++;
                            }
                    
                    
                    

                    
                        /*
                    
                            // printing out the results
                        System.out.println();
                        for(int g = 0; g < studentOne.length; g++){
                            System.out.println(studentOne[g]);
                            System.out.println(studentTwo[g]);
                            System.out.println(studentThree[g]);
                            System.out.println(studentFour[g]);
                            System.out.println(studentFive[g]);
                        }
                        */


                    
                }

        
        // Set the student scres; method to return the students scores 
                public double [] getTestScoreOne(double [] one){
                    this.studentOne = Arrays.copyOf(one, one.length); 
                    return studentOne;  
                }

                public double [] getTestScoreTwo(double [] two){
                    this.studentTwo = Arrays.copyOf(two, two.length); 
                    return studentTwo; 
                }

                public double [] getTestScoreThree(double [] three){ 
                    this.studentThree = Arrays.copyOf(three, three.length); 
                    return studentThree;  
                }

                public double [] getTestScoreFour(double [] four){
                    this.studentFour = Arrays.copyOf(four, four.length); 
                    return studentFour; 
                }

                public double [] getTestScoreFive(double [] five){
        
                    this.studentFive = Arrays.copyOf(five, five.length);  
                    return studentFive; 
                }

        

    // Method that calculate the average test scores  for each student

        public double [] averageTestScore(){
           
            double totalScore;
            double averageScore; 
            

            

            for(int j = 0; j < STUDENT; j++){
                // set the accumulator to 0 
                    totalScore = 0;
                    averageScore = 0;  

                if(j == 0){
                    //calculate the total of all the numbers and then average it
                        for(int i = 0; i < SIZE; i++){

                            totalScore += studentOne[i];
                        }
                        averageScore = totalScore / SIZE; 

                        // store the number into the array
                        averageStudentScore[j] = averageScore;
    
                    }
                        else if(j == 1){

                            for(int i = 0; i < SIZE; i++){
                                totalScore += studentTwo[i];
                            }
                            averageScore = totalScore / SIZE; 
                            averageStudentScore[j] = averageScore;


                        }
                            else if(j == 2){
                                   
                                for(int i = 0; i < SIZE; i++){
                                    totalScore += studentThree[i];
                                }
                                averageScore = totalScore / SIZE; 

                                averageStudentScore[j] = averageScore;
                        }
                            else if(j == 3){
                                
                                for(int i = 0; i < SIZE; i++){
                                    totalScore += studentFour[i];
                                }
                                averageScore = totalScore / SIZE; 
                                averageStudentScore[j] = averageScore;
                        }
                            else if (j == 4){
                                

                                for(int i = 0; i < SIZE; i++){
                                    totalScore += studentFive[i];
                                }
                                averageScore = totalScore / SIZE; 

                                // store the number into the array
                                averageStudentScore[j] = averageScore;
                            }   
      

        
            
        }

        return averageStudentScore; 
    }


    // method that returns a letter grade based on average test score
    public void returnLetterGrade(){
            // calling method to calulcate the average test score

        
        
        averageTestScore(); 

        for(int i = 0; i < STUDENT; i++){
            // loop through the average scores

            if(averageStudentScore[i] >=90 && averageStudentScore[i] <= 100){
                System.out.println(studentNames.get(i) + " has an average score of " + averageStudentScore[i] + " which is a " + gradeLetter[0] + " letter grade");

            }else if(averageStudentScore[i] >=80 && averageStudentScore[i] <= 89){
                System.out.println(studentNames.get(i) + " has an average score of " + averageStudentScore[i] + " which is a " + gradeLetter[1] + " letter grade");
            }else if(averageStudentScore[i] >=70 && averageStudentScore[i] <= 79){
                System.out.println(studentNames.get(i) + " has an average score of " + averageStudentScore[i] + " which is a " + gradeLetter[2] + " letter grade");
            }else if(averageStudentScore[i] >=60 && averageStudentScore[i] <= 69){
                System.out.println(studentNames.get(i) + " has an average score of " + averageStudentScore[i] + " which is a " + gradeLetter[3] + " letter grade");
            }else if (averageStudentScore[i] >=0 && averageStudentScore[i] <= 59) {
                System.out.println(studentNames.get(i) + " has an average score of " + averageStudentScore[i] + " which is a " + gradeLetter[4] + " letter grade");
            }else{
                System.out.println(studentNames.get(i) + " has an average score of " + averageStudentScore[i] + " which is not in our letter grade");
            }
        
        }


    }







}