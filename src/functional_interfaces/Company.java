package functional_interfaces;

public class Company {
	String companyName;
	int companyId;
	public Company(String companyName, int companyId) {
		super();
		this.companyName = companyName;
		this.companyId = companyId;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "companyName=" + companyName + ", companyId=" + companyId;
	}
	
	
	
}
