
import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        /*
            ASSIGNMENT: write a program that asks whether any members of your party are vegetarian, vegan, or gluten-free
            and then displays only the resturants that you may take the group to. 
        */
        
        choose c = new choose();
        c.userInput();
    }
    
}


class choose{

    public static final String ENTERYESORNO = "Enter yes or no";
    public void userInput(){
        System.out.println("Hello, Let's help you choose a resturant for you and your friends!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Is anyone in your party a vegetarian? " +  ENTERYESORNO);
        String vegetarian = sc.nextLine();

        System.out.println();
        System.out.println("Is anyone in your party a vegan?  " + ENTERYESORNO);
        String vegan = sc.next();

        System.out.println();
        System.out.println("Is anyone in your party gluten-free? " + ENTERYESORNO);
        String glutenFree = sc.next();


        //System.out.println(vegetarian + vegan + glutenFree);

        if(vegetarian.equals("yes"))
        {
            if(vegan.equals("yes"))
            {
                if(glutenFree.equals("yes"))
                {
                    System.out.println("Here are your options: \n\n Corner Cafe \n The Chef's Kitchen ");
                }
                else if(glutenFree.equals("no")){
                    System.out.println();
                    System.out.println("Sorry, there are no resturants available");
                }
            }
            else if(vegan.equals("no"))
            {
                if(glutenFree.equals("yes"))
                {
                    System.out.println("Here are your options: \n\n Main Street Pizza Compnay");
                }
                else if (glutenFree.equals("no")){
                    System.out.println();
                    System.out.println("Here are your options: \n\n Mama's Fine Italian ");
                }
            }

        }else if (vegetarian.equals("no"))
        {
            if(vegan.equals("yes"))
            {
                if(glutenFree.equals("yes"))
                {
                        System.out.println("Super Sorry, there are no resturants available");

                }else if(glutenFree.equals("no"))
                {
                    System.out.println("We apologize, It looks like your party will starve tonight!");
                }
            }
            else if(vegan.equals("no"))
            {
                if(glutenFree.equals("yes"))
                {
                    System.out.println();
                    System.out.println("Man, just drink some water and go to sleep");
                }
                else if(glutenFree.equals("no")){
                    System.out.println();
                    System.out.println("Here are your options: \n\n Joe's Gourment Burger");

                }
            }
        }


        sc.close();

    }

}