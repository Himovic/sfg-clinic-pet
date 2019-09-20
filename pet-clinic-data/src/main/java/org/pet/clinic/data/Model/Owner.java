package org.pet.clinic.data.Model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {
	
	private Set<Pet> setPets = new HashSet<>();
	private String address;
	private String city;
	private String telephone;
	
	public Owner() {
		
	}
	
	public Owner(Set<Pet> setPets, String address, String city, String telephone) {
		this.setPets = setPets;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}

	public Set<Pet> getSetPets() {
		return setPets;
	}

	public void setSetPets(Set<Pet> setPets) {
		this.setPets = setPets;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
}
