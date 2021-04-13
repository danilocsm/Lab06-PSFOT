package model.step;

import model.Subject;
import model.VaccinationRequirements;

public class NotReady implements VaccinationStep {
	
	private Subject subject;
	
	public NotReady(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public String checkNextStep() {
		boolean checkRequirements = subject.getAge().equals(VaccinationRequirements.VACCINATION_AGE.getValue()) || 
									subject.getOccupation().equals(VaccinationRequirements.VACCINATION_OCCUPATION.getValue()) || 
									subject.getComorbidities().equals(VaccinationRequirements.VACCINATION_COMORBIDITIES.getValue());
		return checkRequirements ? "ReadyForFirstDose" : "Not Ready";
	}

	@Override
	public String getCurrentStep() {
		// TODO Auto-generated method stub
		return "Not Ready";
	}

}
