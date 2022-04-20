package dmacc.beans;

import lombok.AllArgsConstructor;
//Manuel Corral Ledezma
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	//TODO autogenerate id
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

