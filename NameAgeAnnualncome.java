import java.util.Scanner;
public class NameAgeAnnualncome {

    public static void main(String[] args) {
        
        String name; 
        int age; 
        double annualPay; 

        Scanner keyboard = new Scanner(System.in); 

        System.out.println("Enter your name: ");
        name = keyboard.nextLine(); 
        System.out.println("Enter your age: ");
        age = keyboard.nextInt(); 
        System.out.println("Enter your annual income: ");
        annualPay = keyboard.nextDouble();


        System.out.println();
        System.out.println("My name is " + name + ", " 
            + " I am " + age + " years and I earn " + annualPay + " per year."
        );

        keyboard.close();


    }
    
}
