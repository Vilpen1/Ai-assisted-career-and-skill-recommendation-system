import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

//This class will be attached to the student class as one of it attributes, students will be able to add/edit/remove skills/Degrees. this will also be used to generate a career suitability score
public class CareerProfile {
    private final Set<Skill> skills;
    private Degree degree;

    //create an empty set of skills
    public CareerProfile(Degree degree) {
        this.degree = degree;
        this.skills = EnumSet.noneOf(Skill.class);
    }

    //Adds the skills to the set, if any set was already given
    public CareerProfile(Degree degree, Set<Skill> skills) {
        this(degree);
        this.skills.addAll(skills);
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void removeSkill(Skill skill) {
        skills.remove(skill);
    }

    public boolean hasSkill(Skill skill) {
        return skills.contains(skill);
    }

    public Set<Skill> getSkills() {
        return Collections.unmodifiableSet(skills);
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
