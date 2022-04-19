package dmacc.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
	private long customerId;
	private long orderId;
	private ArrayList<Item> orderContents = new ArrayList<Item>();
	
	public Order(long customerId, long orderId, ArrayList<Item> orderItem) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.orderContents = orderItem;
	}
}
