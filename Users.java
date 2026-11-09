import java.util.*;

/*
* Description
*
* Users is a level system Creation/Login Class.
*
* Using Password-Username pairs to query a db for a matching pair
*
* Notfound errors asks the user to create a profile
* */

public class Users {
    private String Username;
    private String Password;
    private String Blank = "Blank";
    private int ghost = 0;
    private float casper = 0.0f;
    private boolean LoggedIn;

    /* INTEGERS */
    private int SessionID;

    /* HASHMAPS */
    private HashMap<String, String> LoginInfo = new HashMap<String, String>(); // Username & Password

    private boolean Login(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username: ");
        String Input_username = in.nextLine(); //input
        System.out.println("Enter password: ");
        String Input_password = in.nextLine(); //input

        String holder; //username
        //Check #1
        //this.LoginInfo.contains(Input_username) //has to be boolean done
        //if (false){
        //  holder="username";
        //}

        //Check #2 //Password
        // String storedPassword=this.LoginInfo.get(Input_username)
        // if (storedPassword==Input_password){
        //      LoggedIn = true;
        //}



        return switch (Input_password) { //Change this
            case "username" -> { //zero verification checks
                System.out.println("Username is not found");
                yield false;
            }
            case "password" -> {
                System.out.println("Password is incorrect");
                yield false;
            }
            case "both" -> {
                System.out.println("Both username and password are incorrect");
                // if we only do checks on the button request rather than actively
                yield false;
            }
            default -> true;
        }; //this does nothing currently 09/11/2026

    }
    public boolean Login_AttemptCounter(){
        boolean flag = false;
        int count = 0;
        while (count < 5){
            flag = Login();
            if (flag){

                break;
            }
            count++;
        }
        if (count == 5){
            System.out.println("Login Failed");
        }
        return flag ;
    }
    // has a counter system to keep the user from trying an unreasonable amount of times if credentials aren't known.
    // Can be improved to have scalability in mind.

    public boolean Logout(){
        boolean flag = false;

        System.out.println("Are you sure you want to Logout?\nyes or no");
        String input = new Scanner(System.in).nextLine();
        do{
            try {
                assert input != null;
                if (input.equalsIgnoreCase(" ")) {
                    System.out.println("Enter an option");
                } // needs better empty string checks because "  " and " " are different
            } catch (NullPointerException e) {
                System.out.println("Enter an option.");
            }
        } while(!flag); //the loop is focused only on the error or blank check Verification class

        if (input.equalsIgnoreCase("yes")) {
            flag = true;
            LoggedIn = false;
        } else if (input.equalsIgnoreCase("no")) {
            System.out.println("what would you like to do?");
            // Back to main menu
        } else {
            System.out.println("Invalid input");
        }

        if (flag){
            System.out.println("Logout Successful");
        } else {
            System.out.println("Logout Failed");
        }

        // This needs to be worked on again as it won't function logically


        return flag;
    }

    private void  Initialisation(){
        this.LoginInfo.put("PostgreSuperAdmin", "kafka");//Super Admin for Postgre
        this.LoginInfo.put("PostgreSuperAdminPassword", "kafka123");
    } // this key needs to be hidden from git.

    public void addUser(String username, String password){
        this.LoginInfo.put("username", username);
        this.LoginInfo.put("password", password);
    }

    public Users(String username, String password) {


    }
}

class Verification{

    private String username;
    private String password;

    private boolean ExistsCheck(){
        return false;
    }

    private boolean IsLoggedIn(){
        return false;
    }

    public Verification(String TypeOfVerification) {
        //Input validation
        //ExistChecks
        //Currently Logged in that runs concurrently with exists checks
        //Verify user.
    }
}
///  workflow
///  The Login or Registration page comes through Users to store data
