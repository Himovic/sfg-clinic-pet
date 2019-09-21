package org.pet.clinic.data.Model;

public class Speciality extends BaseEntity {
	
	private String description;
	
	public Speciality() {
		
	}
	
	public Speciality(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
