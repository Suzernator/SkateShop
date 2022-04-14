package dmacc.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
	private long customerId;
	private long orderId;
	private String orderItem;
	
	public Order(long customerId, long orderId, String orderItem) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.orderItem = orderItem;
	}
}
