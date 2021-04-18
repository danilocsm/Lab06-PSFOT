package model.step;

import java.time.LocalDate;

import model.Subject;

public class FirstDoseDone implements VaccinationStep {
	
	@Override
	public void getNextStep(Subject subject) {
		LocalDate firstDoseDate = LocalDate.now();
		subject.setFirstDoseDate(firstDoseDate);
		subject.setVaccinationStep(new ReadyForSecondDose());
	}

	@Override
	public String toString() {
		return "Subject has taken first dose.";
	}

}
