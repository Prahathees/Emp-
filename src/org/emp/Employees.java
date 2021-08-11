package org.emp;

public class Employees {
	public void empName(String name) {
	System.out.println("Name is"+ name);
}


	public void empName(int roll) {
System.out.println("Employee roll number is "
		+roll);

}
	public void empName(long phonenumb) {
System.out.println("Employee phone number is "
		+phonenumb);
}
	public static void main(String[] args) {
		Employees e = new Employees();
		e.empName(6648686554398l);
		e.empName("Prahthees");
		e.empName(646546);
		
		Employee m = new Employee();
		m.empAddress();
		m.empDob();
	}
}