package systetFunctionalities;
import java.util.Scanner;


public class Authentication {
	

	public static void main(String[] args) {
		

		
		Customer cus = new Customer("12345","pass");
		Employee emp = new Employee("2343","employee");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome");
		
		System.out.println("Please Identify Yourself. Are you a Customer or Employee? Please Enter 1 for Customer and 2 for Employee");
		int Id = input.nextInt(); 
		
		if(Id == 1) {
			while(true) {
			System.out.println("Welcome Customer");
			System.out.println("Please Enter Your ID Number");
			String Customer_ID = input.next(); 
			
			System.out.println("Please Enter Your Password");
			String Customer_Pass = input.next(); 
			
			if(Customer_ID == cus.getID() && Customer_Pass == cus.getPassword()) {
				System.out.println("Authentication Fail");
			}else {
				System.out.println("Authentication Pass");
				
			}
		}
		}else if (Id==2) {
			while(true) {
			System.out.println("Welcome Staff Member");
			System.out.println("Please Enter Your ID Number");
			String Staff_ID = input.next(); 
			
			System.out.println("Please Enter Your Password");
			String Staff_Pass = input.next(); 
			
			//System.out.println("Input password" + Staff_Pass);
			//System.out.println("Other password" + emp.password);
		
			
			if(Staff_ID == emp.ID() && Staff_Pass == emp.password()) {
				System.out.println("Authentication Pass");
				//System.out.println("Input password" + Staff_Pass);
				//System.out.println("Other password" + emp.password);
			}else {
				System.out.println("Authentication Fail");
				//System.out.println("Input password" + Staff_Pass);
				//System.out.println("Other password" + emp.password);
			}
			
		}
		}
		input.close();
	}
}
