package streamAPI_Project;

public class Product {
	private String productId;
    private String name;
    private String category; // Using a String for category
    private double price;
	public Product(String productId, String name, String category, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", category=" + category + ", price=" + price
				+ "]";
	}
    
	
    
}
