package functional_interfaces;

public class Sales {
	String companyName;
	String productName;
	Double price;
	public Sales(String companyName, String productName, Double price) {
		super();
		this.companyName = companyName;
		this.productName = productName;
		this.price = price;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return " companyName=" + companyName + ", ProductName=" + productName + ", price="
				+ price;
	}
	
	
	
}
