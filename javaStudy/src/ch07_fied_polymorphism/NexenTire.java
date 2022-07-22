package ch07_fied_polymorphism;

public class NexenTire extends Tire {
	public NexenTire(String location,int maxRotation)
	{
			super(location,maxRotation);
	}
	// 메서드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location + "NexenTire수명:" + (maxRotation-accumulatedRotation) + "회");
			return true;
	}else {
		System.out.println("***" + location + "NexenTire펑크***");
		return false;
		}
	}
}
