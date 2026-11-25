import java.util.EnumSet;
import java.util.Set;

public record Requirements(Set<Skill> skills, Degree requiredDegree) {

    //Is a compact constructor, so when its called it creates a requirements attribute for the selected Career,
    public Requirements {
        Set<Skill> copy = EnumSet.noneOf(Skill.class);
        copy.addAll(skills);
        skills = Set.copyOf(copy);   // immutable copy
    }
}
