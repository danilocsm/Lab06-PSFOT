package model.step;

public class ReadyForFirstDose implements VaccinationStep {

	@Override
	public String checkNextStep() {
		// TODO Auto-generated method stub
		return "First Dose Done";
	}

	@Override
	public String getCurrentStep() {
		// TODO Auto-generated method stub
		return "Ready for first dose";
	}

}
