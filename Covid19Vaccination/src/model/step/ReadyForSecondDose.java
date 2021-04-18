package model.step;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Subject;

public class ReadyForSecondDose implements VaccinationStep {

	@Override
	public void getNextStep(Subject subject) {
		long daysSinceFirstDose = subject.getFirstDateDose().until(LocalDate.now(), ChronoUnit.DAYS);
		if(daysSinceFirstDose >= 20){
			subject.setVaccinationStep(new VaccinationDone());
		}
	}

	@Override
	public String toString() {
		return "Subject is ready for second dose.";
	}
}
