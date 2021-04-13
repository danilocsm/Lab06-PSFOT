package model.step;

public class VaccinationDone implements VaccinationStep {

	@Override
	public String checkNextStep() {
		// TODO Auto-generated method stub
		return "No more steps. You have been immunized against Covid-19";
	}

	@Override
	public String getCurrentStep() {
		// TODO Auto-generated method stub
		return "Vaccination Done";
	}

}
