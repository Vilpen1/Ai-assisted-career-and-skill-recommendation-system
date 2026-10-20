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

    /* INTEGERS */
    private int SessionID;

    /* HASHMAPS */
    private HashMap<Integer, String> Admin_Usernames = new HashMap<>(); // ID and username
    private HashMap<Integer, String> Admin_Passwords = new HashMap<>(); // ID and Password
    private ArrayList<String[]> Admin_Rest = new ArrayList<>(); // rest of the admin details
    // private final Verification obj_Verify = new Verification(Admin_Rest); //all methods use this
    //public Admin obj_admin; not this assingment
    //even if public it can only be used if login is successful
    //Made Public as is the only way for a logged user to have access to admin.
    //Else the connection is lost.

    private static int AdminID_Generator(){
        return (int) (Math.random() * (100-1)+1);
    } //verify when adding new

    private boolean Login(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = in.nextLine();
        System.out.println("Enter password: ");
        String password = in.nextLine();


        // String test = obj_Verify.verify_Login(username, password); not this assignment
        String holder = new Scanner(System.in).nextLine();
        //means the values are assignable
        // pretty useless case the flag is the only thing passed.
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
    // has a counter system to keep the user from trying an unreasonable amount of times if credentials aren't known

    private boolean Logout(){
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Are you sure you want to Logout?\nyes or no");
        String input = in.nextLine();

        if (input.equals("yes")){
            //flag = obj_admin.logout(); not this assignment
            //pass this on to the obj_admin class
        } else if  (input.equals("no")){
            System.out.println("what would you like to do?");
        } else {
            System.out.println("Invalid input");
        }

        return flag;
    } //works
    public void LogoutT(){
        if  (Logout()){
            System.out.println("Logout Successful");
        } else {
            System.out.println("Logout Failed");
        }
    } // works

    public Users() {
        this.SessionID = (int)(Math.random()*1000000);
        boolean AdminAccess = false;
        int num = AdminID_Generator();
    }
}

