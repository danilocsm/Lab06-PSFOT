package model.step;

import model.Subject;
import model.VaccinationRequirements;

public class NotReady implements VaccinationStep {
	private VaccinationRequirements vaccReq = new VaccinationRequirements();
	@Override
	public void getNextStep(Subject subject) {
		boolean checkRequirements = subject.getAge() == vaccReq.getRequiredAge() || 
									subject.getOccupation().equals(vaccReq.getRequiredOccupation()) || 
									subject.getComorbidities().equals(vaccReq.getRequiredComorbidity());
		if(checkRequirements) {
			subject.setVaccinationStep(new ReadyForFirstDose());
		}
	}

	@Override
	public String toString() {
		return "Subject is not ready to take the first dose.";
	}
}


