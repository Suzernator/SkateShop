package dmacc.beans;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
//Manuel Corral Ledezma
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String itemName;
	private String itemLocation;
	private String itemDescription;
	
	public Inventory(long itemId, String itemName) {
		super();
		this.id = itemId;
		this.itemName = itemName;
	}

}
