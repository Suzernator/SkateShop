package dmacc.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	//TODO autogenerate id
	private long id;
	private long orderId;
	private ArrayList<Item> orderContents = new ArrayList<Item>();
	
}
