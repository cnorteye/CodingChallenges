

public class GradeBookDemo {
    public static void main(String[] args) {
       
        String textbox = """
                    Welcome teacher to your digital gradebook. This is where you can enter your students names and tests score. 
                """;

        System.out.println(textbox);

        GradeBook test = new GradeBook(); 
        test.setStudentNames();
        test.setTestScores();
        test.averageTestScore();
        test.returnLetterGrade();
    }
}
