import java.util.EnumSet;
import java.util.Set;

public class Career {
    private int id;
    private String careerName;
    private String careerDescription;
    private String careerProf; //for example a career in a hospital, would have a degree/ suitability towards a medicine degree
    private int suitabilityScore;
    private Requirements careerRequirements; // a list of required skills and required degrees, will be used to produce a suitability score for the student

    //Constructor
    public Career(int id, String careerName, String careerDescription, String careerProf) {
        this.id = id;
        this.careerName = careerName;
        this.careerDescription = careerDescription;
        this.careerProf = careerProf;

    }
    public void DisplayCareer(){
        System.out.println(careerName);
        System.out.println(careerDescription);
    }

    public void DisplayCareerRequirements() {
        System.out.println(careerRequirements.skills());
        System.out.println(careerRequirements.requiredDegree());
    }

    //will be used by the career advisor to create different career profiles
    public void CreateRequirements(Set<Skill> skills, Degree requiredDegree) {
        this.careerRequirements = new Requirements(skills, requiredDegree);
    }




}
