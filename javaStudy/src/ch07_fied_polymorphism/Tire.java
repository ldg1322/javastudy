package ch07_fied_polymorphism;

public class Tire {
	//필드
	public int maxRotation; //최대회전수(타이어수명)
	public int accumulatedRotation; //누적회전수
	public String location; //타이어의위치
	//생성자
	public Tire(String location,int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//매소드
	// 누적 회전수, 수명체크, 결과 반환 -> 수명이 다하면 바퀴를 교체
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location + "Tire수명:" + (maxRotation-accumulatedRotation)+"회");
				return true;
		}else{
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}
