package model.step;

public class ReadyForSecondDose implements VaccinationStep {

	@Override
	public String checkNextStep() {
		// TODO Auto-generated method stub
		return "Vaccination Done";
	}

	@Override
	public String getCurrentStep() {
		// TODO Auto-generated method stub
		return "Ready For Second Dose";
	}

}
