import Sessions.Users;

import java.time.LocalDate;
public class Student extends Users {
    private int id;
    private String fullName;
    private String userName;
    private String password;
    private String dateOfBirth;
    private String address;
    private int age;
    private String currentDegree;
    private String skillProf; //what skill they are best suited to

    //constructor
    public Student(int id, String fullName, String userName, String password,String dateOfBirth, String address, int age, String currentDegree, String skillProf){
        super(userName, password ); //matches the username from the User class to the Student class
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.age = age;
        this.currentDegree = currentDegree;
        this.skillProf = skillProf;
    }

    //display the student that was made in Main
    public void DisplayStudent(){
        System.out.println("Student ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Current Degree: " + currentDegree);
        System.out.println("Skill Profile: " + skillProf);
    }
}
