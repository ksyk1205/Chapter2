package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���");
		
		System.out.println(Employee.getSerialNum());
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");  
		//employeeKim.serialNum++;
		
		System.out.println(employeeLee.getEmployeeName()+"���� �����"+employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName()+"���� �����"+employeeKim.getEmployeeId());
	}

}
