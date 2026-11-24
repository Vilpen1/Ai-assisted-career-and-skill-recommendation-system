import database.Database;

public class Main {
    private void browse(){}
    private void CareerTest(){}
    private void home(){}

    public static void main(String[] args) {
        System.out.println("Welcome to Kafca, your Ai assisted application designed to help students find their careers.");

        Database db = new Database();
       // db.Connect();
        // db.Disconnect();
        // helloooo

        Student newStudent = new Student(1, "Fair","Vilpen","dude","12/05/2006","65 eliz",21,"software","coding");
        newStudent.DisplayStudent();
        }



    }

