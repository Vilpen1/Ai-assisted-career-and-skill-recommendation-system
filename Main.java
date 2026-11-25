import database.Database;

import java.util.EnumSet;
import java.util.Set;

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



        //Test for creating a student and their respective student profile
        Student newStudent = new Student(1, "Fair","Vilpen","dude","12/05/2006","65 eliz",21);
        newStudent.CreateStudentProfile(Degree.ComputerScience,EnumSet.of(Skill.Coding, Skill.Teamwork) );
        newStudent.studentProfile.addSkill(Skill.ForeignLanguages);
        newStudent.DisplayStudent();
        newStudent.DisplayStudentProfile();

        Career newCareer = new Career(1,"Lead Developer","Coding job", "Coding");
        newCareer.CreateRequirements(EnumSet.of(Skill.Coding,Skill.Teamwork),Degree.ComputerScience);
        newCareer.DisplayCareer();
        newCareer.DisplayCareerRequirements();
        }



    }

