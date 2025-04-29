package streamAPI_Project;

import java.time.LocalDate;
import java.util.Date;

public class Order {
	 private String orderId;
	    private Customer customer;  // Encapsulation of Customer
	    private Product product;    // Encapsulation of Product
	    private int quantity;
	    private double totalAmount;
	    private String orderAddress;  // Delivery address for the order
	    private LocalDate orderDate;
		public Order(String orderId, Customer customer, Product product, int quantity, double totalAmount,
				String orderAddress, LocalDate localDate) {
			super();
			this.orderId = orderId;
			this.customer = customer;
			this.product = product;
			this.quantity = quantity;
			this.totalAmount = totalAmount;
			this.orderAddress = orderAddress;
			this.orderDate = localDate;
		}
		public String getOrderId() {
			return orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getOrderAddress() {
			return orderAddress;
		}
		public void setOrderAddress(String orderAddress) {
			this.orderAddress = orderAddress;
		}
		public LocalDate getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", customer=" + customer + ", product=" + product + ", quantity="
					+ quantity + ", totalAmount=" + totalAmount + ", orderAddress=" + orderAddress + ", orderDate="
					+ orderDate + "]\n";
		}
	    
	    
}
