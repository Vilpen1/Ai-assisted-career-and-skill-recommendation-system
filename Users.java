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
    private boolean blank = true;

    /* INTEGERS */
    private int SessionID;

    /* HASHMAPS */
    private HashMap<String, String> LoginInfo = new HashMap<String, String>(); // Username & Password
    // private HashMap<> Blank_Map = new HashMap<>(); // ID and Password
    // private final Verification obj_Verify = new Verification(Admin_Rest); //all methods use this

    private boolean Login(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = in.nextLine();
        System.out.println("Enter password: ");
        String password = in.nextLine();

        String holder = new Scanner(System.in).nextLine();
        return switch (holder) {
            case "username" -> {
                System.out.println("Username is incorrect");
                yield false;
            }
            case "password" -> {
                System.out.println("Password is incorrect");
                yield false;
            }
            case "both" -> {
                System.out.println("Both username and password are incorrect");
                yield false;
            }
            default -> true;
        };

    }
    public boolean Login_AttemptCounter(){
        boolean flag = false;
        int count = 0;
        while (count < 5){
            flag = Login();
            if (flag){
                //obj_admin = new Admin(Username,Password); // not this assignment
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
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Are you sure you want to Logout?\nyes or no");
            String input = in.nextLine();

            try {
                assert input != null;
                if (input.equalsIgnoreCase(" ")) {
                    System.out.println("Enter an option");
                }
            } catch (NullPointerException e) {
                System.out.println("Enter an option");
            }

            if (input.equals("yes")) {
                flag = true;
                //flag = obj_admin.logout(); not this assignment
                //pass this on to the obj_admin class
            } else if (input.equals("no")) {
                System.out.println("what would you like to do?");
            } else {
                System.out.println("Invalid input");
            }

            if (flag){
                System.out.println("Logout Successful");
            } else {
                System.out.println("Logout Failed");
            }
        } while (!flag);
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

///  workflow
///  The Login or Registration page comes through Users to store data
