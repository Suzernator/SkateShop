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
	private int itemID;
	private double itemPrice;
	private String itemName;
	
}
