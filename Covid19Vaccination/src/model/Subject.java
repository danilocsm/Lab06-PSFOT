package model;

import java.time.LocalDate;

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
    
    private int age;

	private LocalDate firstDoseDate; 

	public Subject(String name, String email, String cpf, String address, String phone,
			String occupation, String comorbidities, int age) {
		super();
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.address = address;
		this.phone = phone;
		this.occupation = occupation;
		this.comorbidities = comorbidities;
		this.age = age;
		this.vaccinationStep = new NotReady();
		this.vaccinationStep.getNextStep(this);
	}

	public void updateVaccinationStep() {
		this.vaccinationStep.getNextStep(this);
	}

	public String getVaccinationStep() {
		return this.vaccinationStep.toString();
	}	

	public void setVaccinationStep(VaccinationStep vaccinationStep) {
        this.vaccinationStep = vaccinationStep;
    }
    
	public void setFirstDoseDate(LocalDate daysSinceFirstDose) {
		this.firstDoseDate = daysSinceFirstDose;
	}

	public LocalDate getFirstDateDose() {
		return this.firstDoseDate;
	}

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
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
