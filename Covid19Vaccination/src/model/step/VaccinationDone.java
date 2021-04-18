package model.step;

import model.Subject;

public class VaccinationDone implements VaccinationStep {

	@Override
	public void getNextStep(Subject subject) {

	}

	@Override
	public String toString() {
		return "Subject has completed all vaccination steps.";
	}
}

