package model;

import java.util.HashMap;
import java.util.Map;

import model.step.NotReady;

public class VaccineRegister {
	
	private Map<String, Subject> subjects;
	
	public VaccineRegister() {
		this.subjects = new HashMap<String, Subject>();
	}

	public boolean registerSubject(String name, String email, String cpf, String address, String phone,	String occupation, String comorbidities, int age) {
		Subject newSubject = new Subject(name, email, cpf, address, phone, occupation, comorbidities, age);
		subjects.put(cpf, newSubject);
		return true;
	}

	public void updateSubjectData(String cpf, String comorbidities, int age, String occupation) {
		Subject subject = subjects.get(cpf);
		if(subject != null) {
			subject.setComorbidities(comorbidities);
			subject.setAge(age);
			subject.setOccupation(occupation);
		}
	}

	public void updateSubjectStep(String cpf) {
		Subject subject = subjects.get(cpf);
		if(subject != null){
			subject.updateVaccinationStep();
		}
	}

	public String listSubjectsVaccinationStep() {
		String output = "";
		for(Subject subject: subjects.values()) {
			output += subject.getName() + " - " + subject.getVaccinationStep() + "\n";
		}
		return output;
	}

}
