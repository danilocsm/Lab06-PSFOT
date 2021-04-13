package model.step;

public class FirstDoseDone implements VaccinationStep {

	
	
	@Override
	public String checkNextStep() {
		return "Ready for second dose";
	}

	@Override
	public String getCurrentStep() {
		// TODO Auto-generated method stub
		return "First Dose Done";
	}

}
