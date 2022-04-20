package dmacc.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
	//TODO autogenerate id
	private long id;
	private long orderId;
	private ArrayList<Item> orderContents = new ArrayList<Item>();
	
	public Order(long customerId, long orderId, ArrayList<Item> orderItem) {
		super();
		this.id = customerId;
		this.orderId = orderId;
		this.orderContents = orderItem;
	}
}
