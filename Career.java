public class Career {
    private int id;
    private String careerName;
    private String careerDescription;
    private String careerProf; //for example a career in a hospital, would have a degree/ suitability towards a medicine degree
    private int suitabilityScore;
    private String careerRequirements; // a list of required skills and required degrees, will be used to produce a suitability score for the student

    //Constructor
    public Career(int id, String careerName, String careerDescription, String careerProf, int suitabilityScore) {
        this.id = id;
        this.careerName = careerName;
        this.careerDescription = careerDescription;
        this.careerProf = careerProf;
        this.suitabilityScore = suitabilityScore;
    }





}
