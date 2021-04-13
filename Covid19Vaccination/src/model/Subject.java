package model;

import model.step.*;

public class Subject {

    private VaccinationStep vaccinationStep;

    private String name;

    private String email;
    
    private String cpf;

    private String address;

    private String phone;

    private String occupation;

    private String comorbidities;
    
    private String age;

	public Subject(VaccinationStep vaccinationStep, String name, String email, String cpf, String address, String phone,
			String occupation, String comorbidities, String age) {
		super();
		this.vaccinationStep = vaccinationStep;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.address = address;
		this.phone = phone;
		this.occupation = occupation;
		this.comorbidities = comorbidities;
		this.age = age;
	}

	public void changeVaccinationStep(VaccinationStep vaccinationStep) {
        this.vaccinationStep = vaccinationStep;
    }
    
    public String getStep() {
    	return this.vaccinationStep.getCurrentStep();
    }
    
    public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getComorbidities() {
		return comorbidities;
	}

	public void setComorbidities(String comorbidities) {
		this.comorbidities = comorbidities;
	}
}
