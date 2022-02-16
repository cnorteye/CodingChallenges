import java.util.Scanner;

public class WiFiDiagnosticTree {

    public static final String DIDITWORK = "Did that fix the problem? Enter yes or no.";
    public static final String YESITWORKED = "Excellent, have a wonderful day!";
    public static void main(String[] args) {
      Scanner keyboad = new Scanner(System.in);

        System.out.println("HELLO, and welcome to FixMyWiFi.com. We have a series of questions to help you determine what is wrong with your WiFi" + 
            " and what your next steps should be if nothing works ");

            System.out.println();
            System.out.println("To get started: Reboot the computer and try to connect.");
            System.out.println(DIDITWORK);

            String userResponse = keyboad.next();
            //System.out.println(userResponse);
            

            if( userResponse.equals("yes")){
                System.out.println();
                System.out.println(YESITWORKED);
            } else if (userResponse.equals("no")){
                System.out.println();
                System.out.println("Reboot the router and try to connect ");
                System.out.println(DIDITWORK);
                userResponse = keyboad.next();

                if (userResponse.equals("yes")){
                    System.out.println();
                    System.out.println(YESITWORKED);
                }else if (userResponse.equals("no")){
                    System.out.println();
                    System.out.println("Make sure the cables between the router & modem are plugged in firmly.");
                    System.out.println(DIDITWORK);
                    userResponse = keyboad.next();

                    if (userResponse.equals("yes")){
                        System.out.println();
                        System.out.println(YESITWORKED);
                    }else if (userResponse.equals("no")){
                        System.out.println();
                        System.out.println("Move the router to a new location and try to connect");
                        System.out.println(DIDITWORK);
                        userResponse = keyboad.next();

                        if (userResponse.equals("yes")){
                            System.out.println();
                            System.out.println(YESITWORKED);
                        }else if (userResponse.equals("no")){
                            System.out.println();
                            System.out.println("Get a new router");
                        }
                    }
                }
            }
            
            /*
            switch(keyboad) {

                case 0:
                System.out.println("Reboot the router and try to connect ");
                System.out.println(DIDITWORK);
                userResponse = keyboad.next();
                break;

                case 0:
                System.out.println("Make sure the cables between the router & modem are plugged in firmly");
                System.out.println(DIDITWORK);
                userResponse = keyboad.next();
                break;

                case 0: 
                System.out.println("Move the router to a new location and try to connect");
                System.out.println(DIDITWORK);
                userResponse = keyboad.next();
                break;   

                case 0: 
                System.out.println("Get a new router");
                break; 

                default:
                System.out.println("Excellent, have a wonderful day!");
                break;

                
            }
            */
  
  
  
            keyboad.close();


    }
}

