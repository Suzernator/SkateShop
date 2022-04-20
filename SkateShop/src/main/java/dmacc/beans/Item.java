/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Apr 18, 2022
 */
package dmacc.beans;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {
	//TODO autogenerate id
	private int id;
	private double itemPrice;
	private String itemName;
	
}
