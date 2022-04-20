package dmacc.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	private String organization;


	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer(long id, String organization) {
		super();
		this.id = id;
		this.organization = organization;
	}
	
}

