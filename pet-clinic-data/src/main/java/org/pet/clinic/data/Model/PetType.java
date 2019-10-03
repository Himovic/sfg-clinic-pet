package org.pet.clinic.data.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "petsType")
public class PetType extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "type")
	private String name;
}
