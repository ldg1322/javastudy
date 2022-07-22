package ch11_object_compare;

public class GcEx {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("emp가최종적으로참조하는사원번호:");
		System.out.println(emp.eno);
		System.gc();
	}
}
