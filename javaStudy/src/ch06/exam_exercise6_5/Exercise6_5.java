package ch06.exam_exercise6_5;

public class Exercise6_5 {
	public static void main(String args[]) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}	
	class Student {
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
			
		public Student(String name, int ban, int no, int kor, int eng, int math) {
			super();
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		// info () 메서드
		public String info() {
			return name + "," + ban + "," + no + "," + kor + "," + eng
					+ "," + math + "," + getTotal() + "," + getAverage();
		}
		// 메서드 반환형 메서드 이름(매개 변수) { }
		int getTotal() {
			// 국어, 영어, 수학 
			return kor + eng + math;
		}
		
		float getAverage() {
			// 평균 : 총점 / 과목수 -> 소수점 둘째 자리에서 반올림
			int sum = getTotal();
			// 소수점 둘째자리 : * 10 -> / 10
			// 셋쨰자리까지 : * 100 -> / 100
			// 넷째자리 : * 1000 -> / 1000
			 return (int)((sum / 3.0f) * 10 + 0.5f) / 10.0f;// 주의사항 : sum 또는 과목수가 float으로 해야 한다. 
			// return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		}
}
