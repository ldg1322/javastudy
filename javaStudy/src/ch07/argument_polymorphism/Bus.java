package ch07.argument_polymorphism;

public class Bus extends Vehicle {
	
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
}
