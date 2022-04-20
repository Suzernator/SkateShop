/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Apr 18, 2022
 */
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
public class Item {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private double itemPrice;
	private String itemName;
	
}
