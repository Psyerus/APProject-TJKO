package systetFunctionalities;

public class Customer {

	protected String ID;
	protected String password; 
	
	
	public Customer() {
		ID=" ";
		password=" ";
	}
	
	public Customer(String ID, String password) {
		this.ID= ID;
		this.password=password;
		
	}
	
	public Customer (Customer cus) {
		ID= cus.ID;
		password= cus.password;
	}
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", password=" + password + "]";
	}

	public String ID() {
		// TODO Auto-generated method stub
		return null;
	}

	public String password() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
