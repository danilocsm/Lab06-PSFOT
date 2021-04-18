package model.step;

import model.Subject;

public class ReadyForFirstDose implements VaccinationStep {

	@Override
	public void getNextStep(Subject subject) {
		subject.setVaccinationStep(new FirstDoseDone());
	}
	
	@Override
	public String toString() {
		return "Subject is ready for first dose.";
	}
}
