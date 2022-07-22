package ch11_object_compare;

public class Employee {
	public int eno;

	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ")가메모리에생성됨");
	}

	public void finalize() {
		System.out.println("Employee(" + eno + ")이메모리에서제거됨");
	}

}
