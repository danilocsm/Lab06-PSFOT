package model;

public class VaccinationRequirements {
    private final int VACCINATION_AGE = 65;

    private final String VACCINATION_OCCUPATION = "Teacher";

    private final String VACCINATION_COMORBIDITY = "Heart disease";

    public int getRequiredAge() {
    	return this.VACCINATION_AGE;
    }
    
    public String getRequiredOccupation() {
    	return this.VACCINATION_OCCUPATION;
    }
    
    public String getRequiredComorbidity() {
    	return this.VACCINATION_COMORBIDITY;
    }
}
