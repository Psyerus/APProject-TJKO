package systetFunctionalities;

public class Employee extends Customer {
	
	public Employee(String ID, String password) {
		this.ID= ID;
		this.password=password;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", password=" + password + "]";
	}

	public String password() {
		// TODO Auto-generated method stub
		return null;
	}

	public String ID() {
		// TODO Auto-generated method stub
		return null;
	}

}
