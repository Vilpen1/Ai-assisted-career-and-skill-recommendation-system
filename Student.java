import Sessions.Users;
import java.util.Collections;
import java.time.LocalDate;
import java.util.EnumSet;
import java.util.Set;

public class Student extends Users {
    private int id;
    private String fullName;
    private String userName;
    private String password;
    private String dateOfBirth;
    private String address;
    private int age;
    public CareerProfile studentProfile;

    private String careerPreferences;
    private int careerSuitabilityScore;

    //Student creates their own career profile; adds their Degrees, skills and any preferences
    public void CreateStudentProfile(Degree degree, Set<Skill> skills) {
        this.studentProfile = new CareerProfile(degree, skills);
    }

    //Takes in the students current degree, skills, and career preference, looks at the selected career and generates a suitability score based on that careers requirements and the students current degree and skills
    public int CalculateSuitabilityScore(Career career) {
        return careerSuitabilityScore;
    }
    
    //constructor
    public Student(int id, String fullName, String userName, String password,String dateOfBirth, String address, int age){
        super(userName, password ); //matches the username/password from the User class to the Student class
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.age = age;
        //an empty student profile should automatically be made upon creation of a new student

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

    }

    public void DisplayStudentProfile(){

        System.out.println(studentProfile.getDegree());
        System.out.println(studentProfile.getSkills());
    }
}
