package org.employee;

public class EmployeeDetails { // block or body of the Class
	
	private void empName() {
		// implementation details / business logic
		// double quote = String : predefined class
		System.out.println("Employee name : Anand");
	}
	
	private void empId() {
		System.out.println("Employee id : 111");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile : 8939278836");
	}
	
	public static void main(String[] args) {
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
//		e.empId();
//		e.empMobile();
		
	}
	
	

}
