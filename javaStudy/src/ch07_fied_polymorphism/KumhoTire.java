package ch07_fied_polymorphism;

public class KumhoTire extends Tire {
		//필드
		//생성자
		public KumhoTire(String location,int maxRotation)
	{
			super(location,maxRotation);
	}
	//매소드
	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location + "KumhoTire수명:" + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else{
			System.out.println("***" + location + "KumhoTire펑크***");
			return false;
		}
	}

}
