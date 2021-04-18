package model.step;

import model.Subject;

public interface VaccinationStep {

	public void getNextStep(Subject subject);
	public String toString();
	
}
